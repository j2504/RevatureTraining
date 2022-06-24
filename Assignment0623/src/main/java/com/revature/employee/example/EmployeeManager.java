package com.revature.employee.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(01,"Michael", "Jordan", 100000);
		Employee e1 = new Employee(23,"Kobe", "Bryant", 99000);
		Employee e2 = new Employee(03,"Lebron", "James", 100000);
		
		List<Employee> mylist = new ArrayList<Employee>();
		mylist.add(e);
		mylist.add(e1);
		mylist.add(e2);
		
		
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println(mylist);
		
		System.out.println("Sort by First Name...");
		
		Collections.sort(mylist, new FirstNameComparator());
		
		System.out.println(mylist);
		
		System.out.println("Sort by Last Name...");
		
		Collections.sort(mylist, new LastNameComparator());
		
		System.out.println(mylist);
		
		System.out.println("Sort by Salary...");
		
		Collections.sort(mylist, new SalaryComparator());
		
		System.out.println(mylist);
		
		
	}

}
