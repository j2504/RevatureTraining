package com.revature.myclasses;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee []em = new Employee[5];
		
		for(int i = 0; i < em.length;i++) {
			em[i] = new Employee();
		}
		em[0].newEmployee(1, "Jerry", "IT", 100000.00);
		em[1].newEmployee(2, "Josh", "Finacial", 55000.00);
		em[2].newEmployee(3, "Jacob", "Customer Service", 35000);
		em[3].newEmployee(4, "Joe", "Finacial", 55000.00);
		em[4].newEmployee(5, "Jas", "IT", 105000.00);
		
		for(int i=0; i < em.length;i++) {
			em[i].displayEmployee();
		}

	}

}
