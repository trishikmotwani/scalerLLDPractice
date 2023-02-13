package mergesort;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(11);inputList.add(18);inputList.add(5);inputList.add(12);inputList.add(1);
		inputList.add(25);inputList.add(3);inputList.add(2);
		
		ExecutorService es = Executors.newCachedThreadPool();
		Sorter sorterTask = new Sorter(inputList, es);
		Future<ArrayList<Integer>> sorterFuture = es.submit(sorterTask);
		try {
			ArrayList<Integer> ans = sorterFuture.get();
			System.out.print("final sorted list::" + ans.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
