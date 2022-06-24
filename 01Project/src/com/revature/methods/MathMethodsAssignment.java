package com.revature.methods;

import java.util.Scanner;
public class MathMethodsAssignment {
	public static Scanner sc = new Scanner(System.in);
	public static int num1, num2,result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sub();
		multi();
		div();

	}
	
	public static void sum() {
		System.out.print("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		num2 = sc.nextInt();
		result = num1 + num2;
		System.out.println("The sum of "+num1+" and "+num2+" = "+result);
		
	}
	public static void sub() {
		System.out.print("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		num2 = sc.nextInt();
		result = num1 - num2;
		System.out.println("The subtraction of "+num1+" and "+num2+" = "+result);
		
	}
	public static void multi() {
		System.out.print("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		num2 = sc.nextInt();
		result = num1 * num2;
		System.out.println("The multiplication of "+num1+" and "+num2+" = "+result);
		
	}
	public static void div() {
		System.out.print("Enter number 1: ");
		num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		num2 = sc.nextInt();
		result = num1 / num2;
		System.out.println("The division of "+num1+" and "+num2+" = "+result);
		
	}
	

}
