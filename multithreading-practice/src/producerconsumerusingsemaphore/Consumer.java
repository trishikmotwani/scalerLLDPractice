package producerconsumerusingsemaphore;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

	Queue<Shirt> store;
	String name;
	Semaphore forProducer;
	Semaphore forConsumer;
	public Consumer(Queue<Shirt> store, String name, Semaphore forProducer,
	Semaphore forConsumer) {
		this.store = store;
		this.name = name;
		this.forConsumer = forConsumer;
		this.forProducer = forProducer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				forConsumer.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//if(store.size() > 0) {
				store.remove();
				System.out.println("Shirt consumed by task - " + name);
			//}
			
			forProducer.release();
		}
	}
	
	
}
