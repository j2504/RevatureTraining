package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();//method call
	}
	
	//method definition
	public static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();
		int result = n1 + n2;
		System.out.println("Sum of " + n1+ " and "+n2+" = "+result);
	}

}
