package addersubtractorusingsynchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
	Count c;
	public Adder(Count c) {
		this.c = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 10000; i++) {
			synchronized(c) {
				int currVal = c.getValue();
				int nextVal = currVal + 1;
				c.setValue(nextVal);
			}
		}
		
	}
	
}
