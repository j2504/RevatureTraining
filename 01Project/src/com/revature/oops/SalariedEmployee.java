package com.revature.oops;

//Encapsulation
//child class
public class SalariedEmployee extends Employee implements Tax{

	private int daysPresent;
	
	

	public SalariedEmployee() {
		super();
		
	}

	

	public SalariedEmployee(int id, String name, int daysPresent) {
		super(id, name);
		this.daysPresent = daysPresent;
	}



	public int getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}
	
	/*public double calculateSalary(int daysPresent) {
			return 1000.00*this.daysPresent;
	}*/


	

	//Polymorphism 
	
	@Override
	public double calculateSalary(int worked) {
		// TODO Auto-generated method stub
		SalariedEmployee s = new SalariedEmployee();
		return (1000.00*worked);
	}



	@Override
	public double calcTax(double pay, double tax) {
		// TODO Auto-generated method stub
		double result =  pay*tax; 
		return result;
	}



	
	
	
	
	
	
	
}
