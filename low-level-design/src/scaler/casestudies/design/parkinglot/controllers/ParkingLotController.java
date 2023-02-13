package scaler.casestudies.design.parkinglot.controllers;

import java.util.List;
import java.util.Map;

import scaler.casestudies.design.parkinglot.ObjectRegistry;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotRequest;
import scaler.casestudies.design.parkinglot.dtos.CreateParkingLotResponse;
import scaler.casestudies.design.parkinglot.dtos.ResponseStatus;
import scaler.casestudies.design.parkinglot.models.Gate;
import scaler.casestudies.design.parkinglot.models.ParkingFloor;
import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.VehicleTypes;
import scaler.casestudies.design.parkinglot.services.ParkingLotService;
import scaler.casestudies.design.parkinglot.services.ParkingLotServiceImpl;

public class ParkingLotController {
	
	ParkingLotService parkingLotService;
	public ParkingLotController() {
		this.parkingLotService = (ParkingLotService) ObjectRegistry.get("parkingLotService");
	}
	public CreateParkingLotResponse createParkingLot(CreateParkingLotRequest createRequest) {
		CreateParkingLotResponse response = new CreateParkingLotResponse();
		if(createRequest.getNoOfFloors() < 0) {
			response.setStatus(ResponseStatus.Error);
			response.setErrorMessage("There Should be atleast ground floor in the parking, try again.");
			return response;
		}
		ParkingLot parkingLotResponse = this.parkingLotService.createParkingLot(createRequest);
		response.setParkingLot(parkingLotResponse);
		response.setStatus(ResponseStatus.Ok);
		return response;
		
	}
}
