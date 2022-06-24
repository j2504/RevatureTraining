package com.revature.employee.example;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getLastName().compareTo(e2.getLastName());
	}

}
