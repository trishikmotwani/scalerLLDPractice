package printLegacy;

public class PrintTask implements Runnable {

	int numberToPrint;
	public PrintTask(int n) {
		numberToPrint = n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(numberToPrint + " - printed by thread: " + Thread.currentThread().getName());
	}

}
