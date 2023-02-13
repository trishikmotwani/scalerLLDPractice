package scaler.casestudies.design.parkinglot.models;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bill {

	private List<Payment> payments;
	private BillStatus status;
	private LocalDateTime exitTime;
	private Gate exitGate;
	private Operator operator;
	private int amount;
}
