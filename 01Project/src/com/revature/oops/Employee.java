package com.revature.oops;

//parent class
public abstract class Employee {
	//encapsulate
	private int id;
	private String name;
	
	public Employee() {
		super();
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//abstract method 
	public abstract double calculateSalary(int worked);
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
	

}
