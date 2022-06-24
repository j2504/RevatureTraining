package com.revature.mypackage;

public class ArraysDemo {
	static int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = new int[5];
		
		int[] arr2 = {1,2,3,4,5};
		
		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		marks[3] = 4;
		marks[4] = 5;
		
		
		for(int i = 0; i<marks.length+1; i++) {
			result = marks[i] + marks[i + marks.length - 1];
		}
		
		System.out.println("The sum of the array is: "+ result);
		
	}

}
