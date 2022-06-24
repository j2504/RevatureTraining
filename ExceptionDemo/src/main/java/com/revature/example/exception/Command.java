package com.revature.example.exception;


public class Command{
	
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException, CustomException{
		int []command = new int[10];
		
		command[2]= 23;
		CustomException a = new CustomException();
		try {
			
			System.out.println("Start of try block");
			//System.exit(0);
			command[10] = 29; 
			System.out.println("End of try block");
			
			throw new CustomException();
		}catch(ArrayIndexOutOfBoundsException|CustomException e) {
			System.out.println("Start of catch block");
			a.printStackTrace();
			e.printStackTrace();
			System.out.println(a.getMessage());
			System.out.println("End of catch block");
			
		}finally{
			System.out.println("Goodbye..");
		}
		
	}
	
	
	
}

