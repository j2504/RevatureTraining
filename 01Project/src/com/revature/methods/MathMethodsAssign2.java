package com.revature.methods;

import java.util.Scanner;

public class MathMethodsAssign2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int n = sc.nextInt();
		System.out.print("Enter number 2:");
		int n1 = sc.nextInt();
		sum(n,n1);
		sub(n,n1);
		multi(n,n1);
		div(n,n1);

	}
	
	public static int sum(int x, int y) {
		
		int result = x + y;
		System.out.println("The sum of "+x+" and "+y+" = "+result);
		return result;
		
	}
	public static int sub(int x, int y) {
		int result = x - y;
		System.out.println("The subtraction of "+x+" and "+y+" = "+result);
		return result;
		
	}
	public static int multi(int x,int y) {
		int result = x * y;
		System.out.println("The multiplication of "+x+" and "+y+" = "+result);
		return result;
		
		
	}
	public static int div(int x,int y) {
		int result = x / y;
		System.out.println("The division of "+x+" and "+y+" = "+result);
		return result;
		
	}
	

}
