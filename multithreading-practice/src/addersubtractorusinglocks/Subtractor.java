package addersubtractorusinglocks;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
	Count c;
	Lock lock;
	public Subtractor(Count c, Lock lock) {
		this.c = c;
		this.lock = lock;
	}
	public void run() {
		lock.lock();
		for(int i = 0; i < 10000 ; i++) {
			int currValue = c.getValue();
			int nextValue = currValue - 1;
			c.setValue(nextValue);
		}
		lock.unlock();
	}
}
