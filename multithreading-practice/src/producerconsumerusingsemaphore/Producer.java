package producerconsumerusingsemaphore;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

	Queue<Shirt> store;
	int maxSize;
	String name;
	Semaphore forProducer;
	Semaphore forConsumer;
	
	public Producer(Queue<Shirt> store, int maxSize, String name, Semaphore forProducer,
	Semaphore forConsumer) {
		this.store = store;
		this.maxSize = maxSize;
		this.name = name;
		this.forProducer = forProducer;
		this.forConsumer = forConsumer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			try {
				forProducer.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//if(store.size() < maxSize) {
				store.add(new Shirt());
				System.out.println("Shirt produced by task - " + name);
			//}
			forConsumer.release();
		}
	}
}
