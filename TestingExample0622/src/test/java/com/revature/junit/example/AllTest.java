package com.revature.junit.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectClasses({com.revature.junit.example.CalculatorTest.class,com.revature.junit.example.LifeCycleTest.class})
//@SelectPackages
@Suite

public class AllTest {
	
}
