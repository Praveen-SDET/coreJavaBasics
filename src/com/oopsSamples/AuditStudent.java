package com.oopsSamples;

public  class AuditStudent extends Student  {
	String location;
	public AuditStudent(String name, String location) {
		this.name = name;
		this.location = location;
	}
	public AuditStudent(String name) {
		this.name = name;}
	public void gotoClass() {
		System.out.println("Go to Auditorium 1..." + this.name);
	}
	public String toString() {
		String strObj = "Audit Student Name is "+this.name ;
		return strObj;
		
	}
	
	

}
