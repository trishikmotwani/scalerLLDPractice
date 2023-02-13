package passbyref;

import java.util.*;

public class PassByRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		System.out.println(al.toString());
		
		PassByRefDemo.updateList(al);
		System.out.println(al.toString());
		
		PassByRefDemo.updateList2(al);
		System.out.println(al.toString());
	}
	
	public static ArrayList<Integer> updateList(ArrayList<Integer> al) {
		al = new ArrayList<Integer>();
		al.add(2);
		return al;
	}
	public static ArrayList<Integer> updateList2(ArrayList<Integer> al) {
		al.add(3);
		return al;
	}
	
}
