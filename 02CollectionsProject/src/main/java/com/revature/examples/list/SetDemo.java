package com.revature.examples.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		//No duplicates for anyone
		
		
		//Allowed to have null values
		//used for user names 
		Set<String> mySet = new HashSet<String>();
		
		//Sorted by the name in chronological order
		//Set<String> mySet = new TreeSet<String>();
		
		
		//Prints same way inserted with no duplicates
		//Set<String> mySet = new LinkedHashSet<String>();
		
		
		mySet.add("Mike");
		mySet.add("Shay");
		mySet.add("Jay");
		mySet.add("Ab");
		mySet.add("Jay");
		mySet.add(null);
		mySet.add(null);
		
		
		for(String s: mySet)
			System.out.println(s);
		
		
	
	}
}
