package com.oopsSamples;

public class CompanyStudent extends Student {
	String companyName;
	public CompanyStudent(String name, String companyName) {
	this.name = name;
	this.companyName = companyName;
}
	public CompanyStudent(String name) {
		this.name = name;}
	
	public void gotoClass() {
		System.out.println("Goto class after evaluation..." + this.name);
	}
	public String toString() {
		String stecom = "Company Student Name is "+this.name;
		return stecom;
	}
	}
