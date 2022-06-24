package com.revature.examples.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();	
		
		
		myList.add("Archerie");
		myList.add("Brooke");
		myList.add("Nick");
		myList.add("Zidan");
		myList.add("August");
		
		//Sort Array
		
		System.out.println(myList);
		
		//Collections is a class -- do not confuse it by Collection interface
		Collections.sort(myList);
		
		System.out.println(myList);
		
		//Reverse the list
		Collections.reverse(myList);
		
		System.out.println(myList);
		
		Collections.sort(myList, Collections.reverseOrder());
		
		System.out.println(myList);
	}
}
