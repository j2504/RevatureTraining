package com.revature.map.demo;

public class CheckingAccount implements Account {
	
	double availableBalance = 0;
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return availableBalance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		availableBalance += amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount <= availableBalance)
			availableBalance -= amount;
	}

}
