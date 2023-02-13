package addersubtractorusingsynchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Count c = new Count();
		System.out.println("starting count value::" + c.getValue());
		
		Adder adderTask = new Adder(c);
		Subtractor subtractTask = new Subtractor(c);
		ExecutorService executor = Executors.newCachedThreadPool(); // create new ThreadPoolExecutor()
		
		executor.execute(adderTask);
		executor.execute(subtractTask);
		executor.shutdown(); // shoutdown executor
		try {
			executor.awaitTermination(25, TimeUnit.SECONDS); // block shutdown till current tasks are completed by executor
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("final count value::" + c.getValue());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken by adderSubtractor::" + ((endTime - startTime) / 60));
	}
}
