package com.revature.mypackage;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.next();
		
		System.out.println("Hello " + name);

	}

}
