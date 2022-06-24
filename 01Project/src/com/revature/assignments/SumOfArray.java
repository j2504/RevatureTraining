package com.revature.assignments;

import java.util.Random;

public class SumOfArray {

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
		
			System.out.println("These are the current elements of the array:");
		for(int m:arr)
			System.out.print(m+" ");
			
		for(int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("\nThe sum of the elements of the array is: "+sum);
			
	}

}


