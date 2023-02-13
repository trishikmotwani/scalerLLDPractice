package producerconsumerusingsynchronized;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

	Queue<Shirt> store;
	String name;
	public Consumer(Queue<Shirt> store, String name) {
		this.store = store;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			synchronized(store) { // mutex on store
				if(store.size() > 0) {
					store.remove();
					System.out.println("Shirt consumed by task - " + name);
				}
			}
			
		}
	}
	
	
}
