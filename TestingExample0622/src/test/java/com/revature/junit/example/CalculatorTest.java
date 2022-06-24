package com.revature.junit.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	
	Calculator c = new Calculator();
	
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println(".....All Testing beginning....");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("****End of a Test****");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("****Beginning of a Test****");
	}
	
	
	@Test
	
	public void addTest() {
		
		int actualResult = c.add(10, 20);
		//assertEquals(30,actualResult);
		System.out.println("Testing the add method..");
		Assertions.assertEquals(30, actualResult);
	}
	
	@Test
	
	public void subTest() {
		
		int actualResult = c.sub(20, 10);
		//assertEquals(30,actualResult);
		System.out.println("Testing the sub method..");
		Assertions.assertEquals(10, actualResult);
	}
	
	@Test
	
	public void multiTest() {
		
		int actualResult = c.multi(10, 5);
		//assertEquals(30,actualResult);
		System.out.println("Testing the multiplication method..");
		Assertions.assertEquals(50, actualResult);
	}
	
	@Test
	
	public void divTest() {
		
		int actualResult = c.div(20, 10);
		//assertEquals(30,actualResult);
		System.out.println("Testing the division method..");
		Assertions.assertEquals(2, actualResult);
	}
	
	
}
