package scaler.casestudies.design.parkinglot.dtos;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import scaler.casestudies.design.parkinglot.models.Gate;
import scaler.casestudies.design.parkinglot.models.ParkingFloor;
import scaler.casestudies.design.parkinglot.models.ParkingLot;
import scaler.casestudies.design.parkinglot.models.ParkingLotLocations;
import scaler.casestudies.design.parkinglot.models.Vehicle;
import scaler.casestudies.design.parkinglot.models.VehicleTypes;

@Getter
@Setter
public class GenerateParkingTicketRequest {

	private long parkingLotId;
	private long gateId;
	private Vehicle vehicle;
}
