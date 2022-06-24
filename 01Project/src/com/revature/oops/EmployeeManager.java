package com.revature.oops;

public class EmployeeManager {
	public static void main(String[] args) {
		
		//SalariedEmployee se = new SalariedEmployee();
		
		SalariedEmployee se1 = new SalariedEmployee(1,"AAA", 22);
		double sTax = se1.calcTax(se1.calculateSalary(22), 0.10);
		System.out.println("ID:"+se1.getId()+" Name:"+se1.getName()+" Days present:"+se1.getDaysPresent()+" Calculated salary of Salaried Employee :"+ se1.calculateSalary(se1.getDaysPresent()) 
		+ " Calculated salary of Salaried Employee tax:" + sTax);
		
		ContractEmployee ce = new ContractEmployee(2, "Jerry", 40);
		double cTax = ce.calcTax(ce.calculateSalary(40),0.10);
		System.out.println("ID:"+ce.getId()+" Name:"+ce.getName()+" Hours Worked:"+ce.getHoursWorked()+ " Calculated salary of Contract Employee :"+ ce.calculateSalary(40)
		+ " Calculated salary of Salaried Employee tax:" + cTax);
		
	}
}
