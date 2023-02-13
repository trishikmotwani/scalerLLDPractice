package org.parkinglot.parking_lot.services;

import java.time.LocalDateTime;
import java.util.List;

import org.parkinglot.parking_lot.ParkingLot;
import org.parkinglot.parking_lot.models.ParkingReceipt;
import org.parkinglot.parking_lot.models.ParkingSpot;
import org.parkinglot.parking_lot.models.ParkingTicket;
import org.parkinglot.parking_lot.models.Vehicle;
import org.parkinglot.parking_lot.models.VehicleTypes;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;


public class ParkingTwoWheelerService implements ParkingService {

	private ParkingTicketRepository ticketRepo;
	
	public ParkingTwoWheelerService(ParkingTicketRepository ticketRepo) {
		this.ticketRepo = ticketRepo;
	}

	public ParkingTicket parkVehicle(ParkingLot parkingLot, VehicleTypes vehicleType) {
		if(parkingLot.getTwoWheelerTotalSpots() == 0) {
			return null;
		}
		int startingSpot = parkingLot.getTwoWheelerStartSpot();
		int endingSpot = parkingLot.getTwoWheelerEndSpot();
		ParkingTicket ticket = null;
		
		for(int i = startingSpot; i <= endingSpot; i++) {
			// if the vehicle is null that means the parking slot is empty
			if (parkingLot.getParkingSpots().get(i).getVehicle() == null) {
				int newTicketNumber = ticketRepo.getLastTicketNumber() + 1; // parking ticket starts from 1
				ticket = new ParkingTicket(newTicketNumber, LocalDateTime.now(), i);
				
				// occupy the parking slot in parking with the vehicle and add ticket no. to it.
				// parkingLot.getParkingSpots().get(i).setParkingTicket(ticket);
				parkingLot.getParkingSpots().get(i).setVehicle(new Vehicle(vehicleType));
				this.ticketRepo.saveTicket(ticket);
				ticketRepo.setLastTicketNumber(newTicketNumber);
				break;
			}
		}
		return ticket;
	}
	
	public ParkingReceipt unparkVehicle(ParkingLot parkingLot, int ticketNo) {
		PricingModel pricingModel = PricingModelFactory.createPricingModel(parkingLot.getParkingLotLocation());
		ParkingTicket ticket = ticketRepo.getTicket(ticketNo);
		ParkingSpot spotAndVehicleInfoFromTicket = parkingLot.getParkingSpots().get(ticket.getSpotNo());
		Vehicle vehicle = spotAndVehicleInfoFromTicket.getVehicle();
		
		ParkingReceipt receipt = pricingModel.calculateParkingFeesAndReceipt(vehicle, ticketNo);
		// vacant the spot after unparking
		parkingLot.getParkingSpots().get(ticket.getSpotNo()).setVehicle(null);
		return receipt;
	}
}
