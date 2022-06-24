package com.revature.assignments;

import java.util.Random;

public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int n;
		
		
		int []arr = new int [10];
			
		for(int i = 0; i < arr.length;i++) {
			n = ran.nextInt(1, 50);
			arr[i] = n;
			
		}
		
		for(int m:arr)
			System.out.print(m+" ");
		
		System.out.println("\nThese are all the even numbers:");
		
		for(int i =0; i<arr.length;i++) {
			int num = arr[i];
			if(num % 2 == 0)
					System.out.println(num);
		}
		

	}

}
