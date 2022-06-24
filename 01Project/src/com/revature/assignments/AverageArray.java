package com.revature.assignments;

import java.util.Random;

public class AverageArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int n;
		int sum = 0;
		
		int []arr = new int [10];
		
			
		for(int i = 0; i < arr.length;i++) {
			n = ran.nextInt(1, 50);
			arr[i] = n;
		}
		
		System.out.println("This is the current array:");
		for(int m:arr)
			System.out.print(m+" ");
		
		for(int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		int avg = sum / 10;
		
		System.out.println("\nThe average of the array is: "+avg);
		
		
			
		
	}

}
