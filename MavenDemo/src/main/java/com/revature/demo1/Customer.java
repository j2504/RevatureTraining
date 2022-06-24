package com.revature.demo1;

public class Customer {
	
	static String name;
	final int custo;
	
	public Customer(int custo) {
		super();
		this.custo = custo;
	}
	
	public Customer(String name, int custo) {
		this.name = name;
		this.custo = custo;
	}

	@Override
	public String toString() {
		return "Customer custo#=" + custo + "Name:"+name+"]";
	}
	
	
	
	
	
	
	
	

	
	
	

	
	
}
