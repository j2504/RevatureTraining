package com.revature.assignments;
import java.util.Random;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int n;
		
		int []arr = new int [10];
		
			
		for(int i = 0; i < arr.length;i++) {
			n = ran.nextInt(1, 50);
			arr[i] = n;
		}
		
		System.out.println("This is the current array:");
		for(int m:arr)
			System.out.print(m+" ");
		
		
		for (int i = 0; i < arr.length; i++) 
	    {      //Loop over java Array  outer Loop use
	        for (int j = i + 1; j < arr.length; j++) 
	        {  // Loop over java array
	            int tmp = 0;                            //tempraory variable in order to compare.
	            if (arr[i] > arr[j]) 
	            {          //compare outer loop object with inner loop 
	                tmp = arr[i];               // if greater than swapping.
	                arr[i] = arr[j];            // Swaping code here.
	                arr[j] = tmp;
	            }
	        }
	    }
		
			
			System.out.println("\nThis is the new sorted array in ascending order:");
		for(int m:arr)
			System.out.print(m+" ");
			
		
	}

}
