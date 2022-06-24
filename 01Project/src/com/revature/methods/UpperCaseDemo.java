package com.revature.methods;
import java.util.Scanner;
public class UpperCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name:");
		String na = sc.next();
		String u = upperC(na);
		System.out.println(u);
		

	}
	
	public static String upperC(String name) {
		return name.toUpperCase();
	}
}
