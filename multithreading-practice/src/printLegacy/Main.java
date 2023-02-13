package printLegacy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1 ; i <= 100; i++) {
			PrintTask pt = new PrintTask(i);
			Thread t = new Thread(pt);
			t.start();
		}
	}

}
