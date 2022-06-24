package com.revature.demo1;

public class CustomerManager {
	public static void main(String[] args) {
		Customer c = new Customer(1);
		Customer c1 = new Customer("John",2);
		
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
	}
}
