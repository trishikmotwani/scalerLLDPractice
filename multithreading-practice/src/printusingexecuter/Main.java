package printusingexecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i = 1; i <= 100; i++) {
			if(i == 11) {
				System.out.println();
			}
			PrintTask pt = new PrintTask(i);
			es.execute(pt);
		}
	}

}
