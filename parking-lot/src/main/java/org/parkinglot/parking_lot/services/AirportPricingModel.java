package org.parkinglot.parking_lot.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.Vehicle;
import org.parkinglot.parking_lot.models.VehicleCategories;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class AirportPricingModel implements PricingModel {
	class FixedHoursAndPrice {
		int fixedHours;
		int price;
		FixedHoursAndPrice(int fixedHours, int price) {
			this.fixedHours = fixedHours;
			this.price = price;
		}
	}
	private Map<VehicleCategories, Integer> perDayRate = new HashMap<VehicleCategories, Integer>();
	private Map<VehicleCategories, List<FixedHoursAndPrice>> fixedHoursIntervalVehicleRate 
																= new HashMap<VehicleCategories, List<FixedHoursAndPrice>>();
	private ParkingTicketRepository ticketRepo;
	public AirportPricingModel(ParkingTicketRepository ticketRepo) {
		perDayRate.put(VehicleCategories.TwoWheeler, 80);
		perDayRate.put(VehicleCategories.FourWheeler, 100);
		
		List<FixedHoursAndPrice> twoWheelerFixedHoursPriceList = new ArrayList<FixedHoursAndPrice>();
		twoWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(0, 0));
		twoWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(1, 40));
		twoWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(8, 60));
		fixedHoursIntervalVehicleRate.put(VehicleCategories.TwoWheeler, twoWheelerFixedHoursPriceList);
		
		List<FixedHoursAndPrice> fourWheelerFixedHoursPriceList = new ArrayList<FixedHoursAndPrice>();
		fourWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(0, 60));
		fourWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(12, 80));
		fixedHoursIntervalVehicleRate.put(VehicleCategories.FourWheeler, fourWheelerFixedHoursPriceList);
		
		this.ticketRepo = ticketRepo;
	}
	
	public ParkingReceipt calculateParkingFeesAndReceipt(Vehicle vehicle, int ticketNo) {
		ParkingTicket ticket = ticketRepo.getTicket(ticketNo);
		LocalDateTime exitDateTime = LocalDateTime.now();
		int parkingHours = DateTimeUtils.getRoundOffParkingHours(ticket, exitDateTime);
		int parkingDays = DateTimeUtils.getRoundOffParkingDays(parkingHours);
		
		int fees = 0;
		if(parkingDays > 1) {
			fees += parkingDays * perDayRate.get(vehicle.getVehicleCategory());
		} else { 
			List<FixedHoursAndPrice> fixedHoursPriceList = fixedHoursIntervalVehicleRate.get(vehicle.getVehicleCategory());
			for(FixedHoursAndPrice fixedHrsAndPrice: fixedHoursPriceList) {
				if(parkingHours > fixedHrsAndPrice.fixedHours) {
					fees = fixedHrsAndPrice.price;
				}
			}
		}
		
		int newReceiptNum = ticketRepo.getLastReceiptNumber() + 1;
		ticketRepo.setLastReceiptNumber(newReceiptNum);
		
		return new ParkingReceipt(newReceiptNum, ticket.getEntryDateTime(), exitDateTime, fees);
	}

}
