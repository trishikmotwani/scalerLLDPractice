package org.parkinglot.parking_lot;

import org.parkinglot.parking_lot.models.ParkingLotLocations;
import org.parkinglot.parking_lot.models.VehicleTypes;
import org.parkinglot.parking_lot.repositories.ParkingTicketRepository;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingTicketRepository ticketRepo = ParkingTicketRepository.createInstance();
		ParkingLot sampleMallParkingLot = ParkingLot.getBuilder().setParkingLotLocation(ParkingLotLocations.Mall)
				.setTwoWheelerTotalSpots(2).setFourWheelerTotalSpots(0).setHeavyVehicleTotalSpots(0)
				.build();
		
		sampleMallParkingLot.parkVehicle(VehicleTypes.Motorcycle);
		sampleMallParkingLot.parkVehicle(VehicleTypes.Scooter);
		sampleMallParkingLot.parkVehicle(VehicleTypes.Scooter);
		sampleMallParkingLot.unparkVehicle(VehicleTypes.Scooter, 2);
		sampleMallParkingLot.parkVehicle(VehicleTypes.Motorcycle);
		sampleMallParkingLot.unparkVehicle(VehicleTypes.Motorcycle, 1);
		sampleMallParkingLot.parkVehicle(VehicleTypes.Car);
		sampleMallParkingLot.parkVehicle(VehicleTypes.Bus);
		
		System.out.println("#####  mallParkingLot  #####");
		ParkingLot mallParkingLot = ParkingLot.getBuilder().setParkingLotLocation(ParkingLotLocations.Mall)
				.setTwoWheelerTotalSpots(100).setFourWheelerTotalSpots(80).setHeavyVehicleTotalSpots(10)
				.build();
		ticketRepo.setLastTicketNumber(0);ticketRepo.setLastTicketNumber(0);
		mallParkingLot.parkVehicle(VehicleTypes.Motorcycle);
		mallParkingLot.parkVehicle(VehicleTypes.Scooter);
		mallParkingLot.parkVehicle(VehicleTypes.Scooter);
		mallParkingLot.unparkVehicle(VehicleTypes.Scooter, 2);
		mallParkingLot.parkVehicle(VehicleTypes.Motorcycle);
		mallParkingLot.unparkVehicle(VehicleTypes.Motorcycle, 1);
		mallParkingLot.parkVehicle(VehicleTypes.Car);
		mallParkingLot.parkVehicle(VehicleTypes.Bus);
		mallParkingLot.unparkVehicle(VehicleTypes.Bus, 7);
		
	}

}
