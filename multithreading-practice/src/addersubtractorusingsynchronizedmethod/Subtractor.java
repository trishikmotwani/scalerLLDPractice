package addersubtractorusingsynchronizedmethod;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

	Count c;
	public Subtractor(Count c) {
		this.c = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 10000; i++) {
			//synchronized(c) {
				c.updateValueWithOffset(-1);
			//}
		}
	}
	
}
