package mergesort;

import java.util.*;

public class MergeSortMain {
	
	public static void main(String[] args) {
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		inputList.add(11);inputList.add(18);inputList.add(5);inputList.add(12);inputList.add(1);
		inputList.add(25);inputList.add(3);inputList.add(2);
		System.out.print("input list" + inputList.toString());
		MergeSortMain ms = new MergeSortMain();
		ArrayList<Integer> ans = ms.mergeSort(inputList, 0, inputList.size() - 1);
		System.out.print(ans.toString());
	}
	
	public ArrayList<Integer> mergeSort(ArrayList<Integer> arr, int s, int e) {
		if(s == e) {
			// one element is always sorted
			ArrayList<Integer> oneElementList = new ArrayList<Integer>();
			oneElementList.add(arr.get(s));
			return oneElementList;
		}
		int mid = (s + e) / 2;
		ArrayList<Integer> leftArray = mergeSort(arr, s, mid);
		ArrayList<Integer> rightArray = mergeSort(arr, mid + 1, e);
		ArrayList<Integer> ans = merge(leftArray, rightArray);
		return ans;
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
