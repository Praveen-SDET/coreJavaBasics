package com.oopsSamples;

public class PayingStudent extends Student{
	boolean madePayment;
	public PayingStudent(String name , float gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
		
	}
	public PayingStudent(String name) {
		this.name = name;}
	public void gotoClass() {
		System.out.println("Paying Student go to Next Class..." + this.name);
	}
	
}
