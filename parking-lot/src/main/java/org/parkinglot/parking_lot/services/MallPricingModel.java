package org.parkinglot.parking_lot.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.Vehicle;
import org.parkinglot.parking_lot.models.VehicleCategories;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class MallPricingModel implements PricingModel {

	private Map<VehicleCategories, Integer> perHourVehicleRate = new HashMap<VehicleCategories, Integer>();
	private ParkingTicketRepository ticketRepo;
	public MallPricingModel(ParkingTicketRepository ticketRepo) {
		perHourVehicleRate.put(VehicleCategories.TwoWheeler, 10);
		perHourVehicleRate.put(VehicleCategories.FourWheeler, 20);
		perHourVehicleRate.put(VehicleCategories.HeavyVehicle, 50);
		this.ticketRepo = ticketRepo;
	}
	public ParkingReceipt calculateParkingFeesAndReceipt(Vehicle vehicle, int ticketNo) {
		ParkingTicket ticket = ticketRepo.getTicket(ticketNo);
		LocalDateTime exitDateTime = LocalDateTime.now();
		int parkingHours = DateTimeUtils.getRoundOffParkingHours(ticket, exitDateTime);
		
		int fees = parkingHours * perHourVehicleRate.get(vehicle.getVehicleCategory());
		int newReceiptNum = ticketRepo.getLastReceiptNumber() + 1;
		ticketRepo.setLastReceiptNumber(newReceiptNum);
		
		return new ParkingReceipt(newReceiptNum, ticket.getEntryDateTime(), exitDateTime, fees);
	}


}
