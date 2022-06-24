package com.revature.exceptions.demo;

public class FirstExceptionExample {
	
	public static void main(String[] args) {
		int [] arr = new int [5];
		int x = 20, y = 10;
		arr[2] = 15;
		int result;
		//Unchecked Exception
		try {
			System.out.println("Inside Try...");
			arr[5] = 25;
			System.out.println("still inside try");// will not execute after an exception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			//TODO: handle exception
		}finally { //
			
		}
		
		try {
			result= x/y;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Divide by zero");
		}
		System.out.println("This is program is complete....");
	}

}
