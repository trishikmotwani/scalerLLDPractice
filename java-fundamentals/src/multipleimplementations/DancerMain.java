package multipleimplementations;

public class DancerMain implements HipHop, Salsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print((new DancerMain()).dance());
	}

	@Override
	public int dance() {
		// TODO Auto-generated method stub
		return 10;
	}
}
