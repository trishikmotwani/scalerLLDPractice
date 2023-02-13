package mergesort;

import java.util.*;
import java.util.concurrent.*;

public class Sorter implements Callable<ArrayList<Integer>> {
	List<Integer> arrayToSort;
	ExecutorService es;
	public Sorter(List<Integer> arrayToSort, ExecutorService es) {
		this.arrayToSort = arrayToSort;
		this.es = es;
	}
	
	@Override
	public ArrayList<Integer> call() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		if(arrayToSort.size() == 1) {
			ArrayList<Integer> oneElemList = new ArrayList<Integer>();
			oneElemList.add(arrayToSort.get(0));
			return oneElemList;
		}
		int mid = arrayToSort.size() / 2;
		
		List<Integer> leftSubArray = arrayToSort.subList(0, mid); // idxStart inclusive, idxEnd exclusive
		List<Integer> rightSubArray = arrayToSort.subList(mid, arrayToSort.size()); 
//		System.out.println("lsr:" + leftSubArray.toString());
//		System.out.println("rsa:" + rightSubArray.toString());
		
		Sorter sL = new Sorter(leftSubArray, es);
		Sorter sR = new Sorter(rightSubArray, es);
		
		Future<ArrayList<Integer>> leftArrayFuture = es.submit(sL);
		Future<ArrayList<Integer>> rightArrayFuture = es.submit(sR);
		
		ArrayList<Integer> sortedLeftArray = leftArrayFuture.get();
		ArrayList<Integer> sortedRightArray = rightArrayFuture.get();
		ArrayList<Integer> mergedList = merge(sortedLeftArray, sortedRightArray);
		return mergedList;
	}
	public ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		int i = 0; int j = 0;
		while(i < l1.size() && j < l2.size()) {
			if(l1.get(i) <= l2.get(j)) {
				mergedList.add(l1.get(i));
				i++;
			} else {
				mergedList.add(l2.get(j));
				j++;
			}
		}
		while(i < l1.size()) {
			mergedList.add(l1.get(i));
			i++;
		}
		while(j < l2.size()) {
			mergedList.add(l2.get(j));
			j++;
		}
		
		return mergedList;
	}

}
