package com.revature.hashset.assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("Ice Mountain");
		mySet.add("Fiji");
		mySet.add("SmartWater");
		
		Iterator myIt = mySet.iterator();
		
		while(myIt.hasNext())
			System.out.print(myIt.next() + " $ ");
		
		Set<Integer> mySet1 = new TreeSet<Integer>();
		
		mySet1.add(4);
		mySet1.add(25);
		mySet1.add(7);
		
		Iterator myIt1 = mySet1.iterator();
		
		System.out.println(" ");
		while(myIt1.hasNext())
			System.out.print(myIt1.next()+ " & ");
		
		Set<Double> mySet2 = new LinkedHashSet<Double>();
		
		mySet2.add(40.5);
		mySet2.add(50.21);
		mySet2.add(60.25);
		
		Iterator myIt2 = mySet2.iterator();
		
		System.out.println(" ");
		while(myIt2.hasNext())
			System.out.print(myIt2.next()+ " ^ ");
	}

}
