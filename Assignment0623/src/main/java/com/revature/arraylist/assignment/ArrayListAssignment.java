package com.revature.arraylist.assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<String>();
		
		mylist.add("Coca Cola");
		mylist.add("Pepsi");
		mylist.add("RC");
		
		//System.out.println(mylist);
		
		Iterator myIt = mylist.iterator();
		
		while(myIt.hasNext())
			System.out.print(myIt.next() +" - ");
		
		
	}	

}
