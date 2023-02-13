package parkinglot;

import parkinglot.models.ParkingLotLocations;
import parkinglot.models.VehicleCategories;
import parkinglot.models.VehicleTypes;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		
		ParkingLot mallParkingLot = ParkingLot.getBuilder().setParkingLotLocation(ParkingLotLocations.Mall)
				.setTwoWheelerTotalSpots(100).setFourWheelerTotalSpots(80).setHeavyVehicleTotalSpots(10)
				.build();
		
		
		
	}

}
