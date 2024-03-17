package com.oopsSamples;

public abstract class Student {
	String name;
	String address;
	float gpa;
	
	//public Student(String name) {
		//this.name = name;
//	}
	public Student() {
		
	}
	//public Student(String name, float gpa) {
	//	this.name = name;
		//this.gpa = gpa;
	//}
	
	public abstract void gotoClass(); //{            (remove abstract and this // symbol also and remove from the main class also)
	//	System.out.println("Student go to class ..." + this.name);
	//}
	public final void calculateGPA() {
		System.out.println(" Calculate GPA");
	}

}
