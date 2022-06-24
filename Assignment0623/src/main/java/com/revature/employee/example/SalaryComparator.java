package com.revature.employee.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee s1, Employee s2) {
		// TODO Auto-generated method stub
		int result = (int)s1.getSalary() -(int) s2.getSalary();
		return result;
	}

}
