package com.revature.assignments;

import java.util.Random;

public class LargeSmallArray {
	public static void main(String[] args) {
Random ran = new Random();
		
		int n,third,first,second;
		
		int []arr = new int [10];
		
			
		for(int i = 0; i < arr.length;i++) {
			n = ran.nextInt(1, 50);
			arr[i] = n;
			
		}
		
			System.out.println("These are the current elements of the array:");
		for(int m:arr)
			System.out.print(m+" ");
		
		third = first = second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            /* If current element is greater than
            first*/
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
        }
 
        System.out.println("\nThree largest elements are " + first + " " + second + " " + third);
        
        third = first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            /* If current element is less than
            first*/
            if (arr[i] < first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] < second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] < third)
                third = arr[i];
        }
 
        System.out.println("\nThree smallest elements are " + first + " " + second + " " + third);
    
    }
}

