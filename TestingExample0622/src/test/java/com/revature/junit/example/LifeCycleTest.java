package com.revature.junit.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class LifeCycleTest {
	
	@Test
	@Order(2)
	public void firstTest() {
		System.out.println("First Test");
	}
	
	@Test
	//@Disabled
	//@Tag(value = "second")
	@Order(1)
	public void secondTest() {
		System.out.println("Second Test");
	}

	@BeforeEach
	public void beforeEachTest() {
		System.out.println(".....Before Each....");
	}

	@AfterEach
	public void afterEachTest() {
		System.out.println(".....After Each....");
	}
	
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println("#### Before All ####");
	}
}
