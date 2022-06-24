package com.revature.oops;

public class ContractEmployee extends Employee implements Tax {
	
	private int hoursWorked;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int id, String name, int hoursWorked) {
		super(id, name);
		this.hoursWorked = hoursWorked;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	/*public double calculateSalary(int hoursWorked) {
		return 10.5*this.hoursWorked;
	}*/
	
	@Override
	public double calculateSalary(int worked) {
		// TODO Auto-generated method stub
		return 12.00*worked;
	}

	@Override
	public double calcTax(double pay, double tax) {
		// TODO Auto-generated method stub
		double result = pay * tax;
		return result;
	}
	
	
	
	
	
	
	
}
