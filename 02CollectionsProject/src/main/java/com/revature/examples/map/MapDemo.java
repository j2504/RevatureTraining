package com.revature.examples.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Hashtable;

public class MapDemo {
	public static void main(String[] args) {
		
		//Cannot iterate
		//No duplicates it will be overriden by the last key
		//user name & password
		//No NULL values for map only set
		//Map<String,Integer> myMap = new Hashtable<String,Integer>();
		
		//Allows NUll values
		//Map<String,Integer> myMap = new HashMap<String,Integer>();
		
		
		//No null values chronological order
		//If you have a capital and the rest is lowercase then the capital would print first
		Map<String,Integer> myMap = new TreeMap<String,Integer>();
		
		
		//If letter is capital it would p
		myMap.put("mike", 2500);
		//myMap.put("jay", 2500);
		myMap.put("jem", 2501);
		myMap.put("jay", 2600);
		
		
		System.out.println(myMap);
		
		//retrieve the value
		System.out.println(myMap.get("jem"));
		
		//to iterate we use keySet() that returns -- a Set of keys
		Set <String> myKeys = myMap.keySet();
		
		//System.out.println(myKeys);
		
		//.get() returns the value 
		/*for(String s : myKeys)
			System.out.println(s + " - "+ myMap.get(s));
			*/
		
		
	}
}
