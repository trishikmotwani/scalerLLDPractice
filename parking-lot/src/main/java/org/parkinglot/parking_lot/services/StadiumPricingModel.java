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

public class StadiumPricingModel implements PricingModel {
	class FixedHoursAndPrice {
		int fixedHours;
		int price;
		FixedHoursAndPrice(int fixedHours, int price) {
			this.fixedHours = fixedHours;
			this.price = price;
		}
	}
	private Map<VehicleCategories, Integer> perHourVehicleRate = new HashMap<VehicleCategories, Integer>();
	private Map<VehicleCategories, List<FixedHoursAndPrice>> fixedHoursIntervalVehicleRate 
																= new HashMap<VehicleCategories, List<FixedHoursAndPrice>>();
	private ParkingTicketRepository ticketRepo;
	public StadiumPricingModel(ParkingTicketRepository ticketRepo) {
		perHourVehicleRate.put(VehicleCategories.TwoWheeler, 100);
		perHourVehicleRate.put(VehicleCategories.FourWheeler, 200);
		
		List<FixedHoursAndPrice> twoWheelerFixedHoursPriceList = new ArrayList<FixedHoursAndPrice>();
		twoWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(4, 30));
		twoWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(8, 60));
		fixedHoursIntervalVehicleRate.put(VehicleCategories.TwoWheeler, twoWheelerFixedHoursPriceList);
		
		List<FixedHoursAndPrice> fourWheelerFixedHoursPriceList = new ArrayList<FixedHoursAndPrice>();
		fourWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(4, 60));
		fourWheelerFixedHoursPriceList.add(new FixedHoursAndPrice(8, 120));
		fixedHoursIntervalVehicleRate.put(VehicleCategories.FourWheeler, fourWheelerFixedHoursPriceList);
		
		this.ticketRepo = ticketRepo;
	}

	public ParkingReceipt calculateParkingFeesAndReceipt(Vehicle vehicle, int ticketNo) {
		ParkingTicket ticket = ticketRepo.getTicket(ticketNo);
		LocalDateTime exitDateTime = LocalDateTime.now();
		int parkingHours = DateTimeUtils.getRoundOffParkingHours(ticket, exitDateTime);
		
		int fees = 0;
		List<FixedHoursAndPrice> fixedHoursPriceList = fixedHoursIntervalVehicleRate.get(vehicle.getVehicleCategory());
		for(FixedHoursAndPrice fixedHrsAndPrice: fixedHoursPriceList) {
			if(parkingHours > 0) {
				fees += fixedHrsAndPrice.price;
				parkingHours -= fixedHrsAndPrice.fixedHours;
			}
		}
		if(parkingHours > 0) {
			fees += parkingHours * perHourVehicleRate.get(vehicle.getVehicleCategory());
		}
		
		int newReceiptNum = ticketRepo.getLastReceiptNumber() + 1;
		ticketRepo.setLastReceiptNumber(newReceiptNum);
		
		return new ParkingReceipt(newReceiptNum, ticket.getEntryDateTime(), exitDateTime, fees);
	}

}
