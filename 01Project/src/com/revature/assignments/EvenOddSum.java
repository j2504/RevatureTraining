package com.revature.assignments;

import java.util.Random;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int n;
		int sumE = 0;
		int sumO = 0;
		
		int []arr = new int [10];
		int []eArr;
		int []oArr;
			
		for(int i = 0; i < arr.length;i++) {
			n = ran.nextInt(1, 50);
			arr[i] = n;
		}
		
		eArr = new int[arr.length];
		oArr = new int[arr.length];
		
		for(int m:arr)
			System.out.print(m+" ");
		
		
		
		for(int i =0; i<arr.length;i++) {
			int num = arr[i];
			if(num % 2 == 0) {
					eArr[i]= num;
					sumE = sumE + eArr[i];
			}else if(num % 2 == 1) {
					oArr[i] = num;
					sumO = sumO + oArr[i];
			}
		}
		
		
		System.out.println("\nThe sum of the even numbers are:"+sumE);
		System.out.println("The sum of the odd numbers are:"+sumO);


	}

}
