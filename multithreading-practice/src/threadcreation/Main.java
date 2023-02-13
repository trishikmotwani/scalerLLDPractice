package threadcreation;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start from Thread: "+ Thread.currentThread().getName());
		PrintHelloWorldTask phw = new PrintHelloWorldTask();
		
//		when implementing the runnable interface
		Thread t1 = new Thread(phw);
		t1.setName("PrintHelloWorldTask");
		t1.start();
		
//		When extending the thread class
		phw.setName("PrintHelloWorldTask-ExtendsThread");
		phw.start();
	}

}
