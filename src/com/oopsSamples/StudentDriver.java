package com.oopsSamples;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
	//	Student s1 = new Student("Peter");
		Student s1 = new PayingStudent("Peter", 9.5f);
		s1.gotoClass();
		
		Student s2 = new CompanyStudent("John Cena" , "Zuci");
		s2.gotoClass();
		
		Student s3 = new PayingStudent("Arun", 8.7f);
		Student s4 = new CompanyStudent("Sabari", "Zuci");
		
		Student s5 = new AuditStudent("Velraj", "Python Class");
		
		StudentList students = new StudentList();
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		System.out.println("Object of s5 is .." +s5.toString());
		System.out.println("Object of s4 is .." +s4.toString());
		
		
		ArrayList<Student> studs = students.getStudents();
		for(Student stud:studs) {
			
			stud.gotoClass(); //polymorphism is how is worked is using go to class and we nee to access only the gotoclass 
			// if we use gettoclass that will read only ( just try chech the difference b/w getclass and gotoclass)
		}
		
		
	}

}
