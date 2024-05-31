package javaModule;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListSorting {

	public static void main(String[] args) {
		
		//Create an Arraylist
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//Add values to the ArrayList
		al.add(6);
		al.add(3);
		al.add(9);
		al.add(10);
		al.add(16);
 		al.add(1);
 		
 		System.out.println("ArrayList before sorting: "+ al);
 		
 		//Sorting the array
 		Collections.sort(al);
 		
 		System.out.println("ArrayList after sorting in ascending order are: "+ al);
	}
}
