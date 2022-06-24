package com.revature.myclasses;

public class Employee {
	int id;
	String name;
	String department;
	double salary;
	
	public void newEmployee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.department = dept;
		this.salary = salary;
		
	}
	
	public void displayEmployee() {
		System.out.println("ID :"+this.id+" Name: "+this.name+" Department: "+this.department+" Salary: "+this.salary);
	}

}
