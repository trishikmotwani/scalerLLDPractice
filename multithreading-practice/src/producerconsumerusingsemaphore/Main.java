package producerconsumerusingsemaphore;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Shirt> store = new LinkedBlockingQueue<Shirt>();
		final int maxSize = 4;
		Semaphore forProducer = new Semaphore(maxSize);
		Semaphore forConsumer = new Semaphore(0);
		
		Producer p1 = new Producer(store, maxSize, "p1", forProducer,forConsumer);
		Producer p2 = new Producer(store, maxSize, "p2", forProducer,forConsumer);
		Consumer c1 = new Consumer(store, "c1", forProducer,forConsumer);
		Consumer c2 = new Consumer(store, "c2", forProducer,forConsumer);
		Consumer c3 = new Consumer(store, "c3", forProducer,forConsumer);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(p1);
		executor.execute(p2);
		
		executor.execute(c1);
		executor.execute(c2);
		executor.execute(c3);
		
		executor.shutdown();
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
