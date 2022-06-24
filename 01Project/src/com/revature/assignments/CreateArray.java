package com.revature.assignments;


import java.util.Random;
public class CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int num;
		int []arr = new int [10];
			
		for(int i = 0; i < arr.length;i++) {
			num = r.nextInt(1, 50);
			arr[i] = num;
		}
		
	}

}
