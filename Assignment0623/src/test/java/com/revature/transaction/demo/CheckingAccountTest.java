package com.revature.transaction.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.map.demo.CheckingAccount;

public class CheckingAccountTest {

	CheckingAccount ca = new CheckingAccount();
	Scanner s = new Scanner(System.in);

	@Test
	public void depositTest() {
		 System.out.println("-----Checking Account-----");
		 System.out.println("\nEnter Deposit Amount: ");
		 double amount = s.nextDouble();
		 ca.deposit(amount);
		 double actualResult = ca.getBalance();
		 System.out.println("Current Balance: "+actualResult);
		 Assertions.assertEquals(amount, actualResult);
	}
	
	@Test
	public void withdrawTest() {
		System.out.println("-----Checking Account-----");
		ca.deposit(300);
		System.out.println("\nEnter Withdraw Amount: ");
		double amount = s.nextDouble();
		ca.withdraw(amount);
		double actualResult = ca.getBalance();
		System.out.println("Current Balance: "+actualResult);
		Assertions.assertEquals(300 - amount,actualResult);
		
	}
	
	@Test
	public void getBalanceTest() {
		System.out.println("-----Checking Account-----");
		ca.deposit(300);
		double actualResult = ca.getBalance();
		System.out.println("Current Balance: "+actualResult);
		Assertions.assertEquals(300,actualResult);
		
	}
	
}
