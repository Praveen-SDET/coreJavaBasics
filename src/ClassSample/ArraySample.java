package ClassSample;

import java.util.ArrayList;
import java.util.HashMap;

import com.oopsSamples.AuditStudent;
import com.oopsSamples.CompanyStudent;
import com.oopsSamples.PayingStudent;
import com.oopsSamples.Student;

public class ArraySample {

	public static void main(String[] args) {
		ArrayList<Student> St = new ArrayList<>();
		//add Students to the array list
		Student s2 = new PayingStudent("Nani");
		Student s5 = new CompanyStudent("Vani");
		Student s7 = new AuditStudent("Sara");
		Student s8 = new PayingStudent("Ayisha");
		Student s9 = new AuditStudent("Dhoni");
		
	  St.add(s2);
	  St.add(s5);
	  St.add(s7);
	  St.add(s8);
	  St.add(s9);
	  St.remove(s8);
	  System.out.println("List of Students :" +St);
	  for(Student sts:St) {
		  System.out.println(sts);
	  }	
	HashMap<Integer, String> students = new HashMap<>();
	students.put(1,"Nandy");
	students.put(2,"Sandy");
	students.put(3,"Randy");
	students.put(4,"Waandy");
	System.out.println("HashMap: "+students);
	
	//get() method to get value
			String value = students.get(1);
			System.out.println("Value at index 1 :"+value);
			//using keyset()
			System.out.println("Values : " +students.keySet());
			//using entryset()
			System.out.println("Key/Value mappings: "+students.entrySet());
// Remove elements from map
			String valueRem = students.remove("Two");
			System.out.println("Removed one is "+ valueRem);
			
			System.out.println("to string ..."+students.toString());
	}

}
