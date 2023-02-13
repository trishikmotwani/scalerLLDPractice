package scaler.casestudies.design.parkinglot.services;

import java.util.ArrayList;
import java.util.List;

import scaler.casestudies.design.parkinglot.ObjectRegistry;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotRequest;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotResponse;
import scaler.casestudies.design.parkinglot.models.Gate;
import scaler.casestudies.design.parkinglot.models.ParkingFloor;
import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.repositories.ParkingLotRepository;

public class ParkingLotServiceImpl implements ParkingLotService {
	ParkingLotRepository parkingLotRepo;
	public ParkingLotServiceImpl() {
		this.parkingLotRepo = (ParkingLotRepository) ObjectRegistry.get("parkingLotRepo");
	}
	public ParkingLot createParkingLot(CreateParkingLotRequest request) {
		ParkingLot parkingLot = new ParkingLot();
		
		parkingLot.setAddress(request.getAddress());
		parkingLot.setParkingLocation(request.getParkingLotLocation());
		List<ParkingFloor> parkingFloors = new ArrayList<ParkingFloor>();
		for(int i = 0; i < request.getNoOfFloors(); i++) {
			parkingFloors.add(new ParkingFloor());
		}
		parkingLot.setParkingFloors(parkingFloors);
		
		List<Gate> parkingGates = new ArrayList<Gate>();
		for(int i = 0; i < request.getNoOfGates(); i++) {
			parkingGates.add(new Gate());
		}
		parkingLot.setGates(parkingGates);
		
		ParkingLot createdParkingLot = this.parkingLotRepo.createParkingLot(parkingLot);
		return createdParkingLot;
		
	}
}
