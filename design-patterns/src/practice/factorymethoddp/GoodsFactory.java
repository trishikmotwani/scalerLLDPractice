package practice.factorymethoddp;

public class GoodsFactory {

	LogisticsCreator logistics;
	
	public void initialize(String transportVia) {
		if(transportVia.equals("Sea")) {
			logistics = new SeaLogistics();
		} else if(transportVia.equals("Road")) {
			logistics = new RoadLogistics();
		}
	}
	
	public void startTransport(Object goods, String transportVia) {
		
		this.initialize(transportVia);
		logistics.deliverMaal(transportVia);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsFactory gf = new GoodsFactory();
		Object goods = new Object();
		gf.startTransport(goods, "Sea");

	}

}
