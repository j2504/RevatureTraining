package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n = sc.nextInt();
		System.out.println("Enter number 2:");
		int n1 = sc.nextInt();
		sum(n,n1);
	}
	
	public static void sum(int x,int y) {
		int result = x + y;
		System.out.println("The sum of "+x+" and "+y+" is:"+result);
	}
	
	
}
