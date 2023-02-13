package practice.factorymethoddp;

public class RoadLogistics extends LogisticsCreator {

	@Override
	Transporter getTransporter() {
		// TODO Auto-generated method stub
		return new Truck();
	}
	

}
