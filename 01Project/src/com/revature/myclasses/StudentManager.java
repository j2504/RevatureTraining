package com.revature.myclasses;

public class StudentManager {

	public static void main(String[] args) {
		// Create object of Student class
		Student s = new Student();
		
		s.createStudent(3, "Jerry", "Java");
		//Student 2
		Student s1 = new Student();
		s1.createStudent(4, "Mike", "Aws");
		
		s.displayStudent();
		s1.displayStudent();
	
		
		
		

	}

}
