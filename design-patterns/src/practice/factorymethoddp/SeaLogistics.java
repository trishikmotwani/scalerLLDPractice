package practice.factorymethoddp;

public class SeaLogistics extends LogisticsCreator {

	@Override
	Transporter getTransporter() {
		// TODO Auto-generated method stub
		return new Ship();
	}

}
