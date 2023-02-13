package scaler.casestudies.design.parkinglot.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket extends BaseModel {
	private ParkingSpot parkingSpot;
	private LocalDateTime entryTime;
	private Operator operator;
	private Gate entryGate;
	private Vehicle vehicle;
	
}
