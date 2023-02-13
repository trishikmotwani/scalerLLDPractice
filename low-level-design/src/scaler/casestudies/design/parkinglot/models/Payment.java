package scaler.casestudies.design.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel {

	private PaymentModes paymetMode;
	private PaymentStatus paymentStatus;
	private String razorPayRefId;
	private int amount;
}
