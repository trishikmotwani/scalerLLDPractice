package addersubtractorusinglocks;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Count c = new Count();
		System.out.println("starting count value::" + c.getValue());
		long startTime = System.currentTimeMillis();
		Adder a = new Adder(c, lock);
		Subtractor s = new Subtractor(c, lock);
		
		Thread adderTask = new Thread(a);
		Thread subtractorTask = new Thread(s);
		ExecutorService executor = Executors.newCachedThreadPool();
		
		executor.execute(adderTask);
		executor.execute(subtractorTask);
		executor.shutdown(); // shutdown means executer will not take any new tasks and will shut down in certain time ,
								//without waiting of current running tasks to complete
		try {
		//awaitTermination with shutdown ensures executer will take no new tasks but will complete current task which are in execution
			executor.awaitTermination(100, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("final count value::" + c.getValue());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken by adderSubtractor::" + ((endTime - startTime) / 60));
	}
}
