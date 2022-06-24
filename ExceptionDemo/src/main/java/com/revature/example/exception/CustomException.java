package com.revature.example.exception;

public class CustomException extends Exception{
	
	public CustomException() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "Warning: Your command is out of bounds";
	}
	
}




