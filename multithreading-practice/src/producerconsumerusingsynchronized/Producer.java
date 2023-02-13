package producerconsumerusingsynchronized;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {

	Queue<Shirt> store;
	int maxSize;
	String name;
	
	public Producer(Queue<Shirt> store, int maxSize, String name) {
		this.store = store;
		this.maxSize = maxSize;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			synchronized(store) { // mutex on store
				if(store.size() < maxSize) {
					store.add(new Shirt());
					System.out.println("Shirt produced by task - " + name);
				}
			}
		}
	}
}
