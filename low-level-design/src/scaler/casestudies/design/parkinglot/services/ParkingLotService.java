package scaler.casestudies.design.parkinglot.services;

import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotRequest;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotResponse;
import scaler.casestudies.design.parkinglot.models.ParkingLot;

public interface ParkingLotService {

	public ParkingLot createParkingLot(CreateParkingLotRequest request);
}
