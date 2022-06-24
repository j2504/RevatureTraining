package com.revature.examples.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		//List ml = new ArrayList();
		
		//Assign a type generics specify the type 
		//<> is the diamond operator
		//used for just listing names can contain duplicates
		List<String> ml = new ArrayList<String>();
		
		// no duplicates
		//Set ml = new HashSet();
		ml.add("joe");
		ml.add("jacob");
		ml.add("john");
		ml.add("greg");
		ml.add("john");
		
		//1st way to display
		//System.out.println(ml);
		
		//2nd way to display
		/*for( int i = 0; i <ml.size();i++) {
			System.out.print(ml.get(i)+ " , ");
		
		//3rd way -- using iterator
		Iterator mlItr =  ml.iterator();
		while(mlItr.hasNext())
			System.out.print(mlItr.next() + " - ");
		*/
		//Only works with generics
		//4th way -- using Enhanced for loop
		for(String s:ml)
			System.out.print(s + " # ");
		
		ml.add("Austin");
		ml.add("Franklin");
		
		for(String s:ml)
			System.out.println(s);
		
		//will remove the first one in the list
		ml.remove("john");
		
		for(String s:ml)
			System.out.println(s);
		
		
		List<String> m1 = new ArrayList<String>();
		m1.add("Jamari");
		m1.add("Kobe");
		
		// add all of list 2 to list 1
		ml.addAll(m1);
		
		for(String s:ml)
			System.out.print("\n"+s + " $ ");
		
		//checks if a list contains a certain object and returns true or false
		System.out.println("\nDoes the list contain me "+ m1.contains("Kobe"));
		
		}
		
	}
//}
