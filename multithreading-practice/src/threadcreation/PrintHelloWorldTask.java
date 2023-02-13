package threadcreation;

public class PrintHelloWorldTask extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello World from thread: " + Thread.currentThread().getName());
	}
}
