package scaler.casestudies.design.parkinglot.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate {

	private GateTypes gateType;
	private GateStatus gateStatus;
	private Operator operator;
	private int gateNumber;
	
}
