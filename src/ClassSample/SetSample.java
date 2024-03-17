package ClassSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber = new HashSet();
		
		//using add() method 
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		// while printing it will be ordered 
		evenNumber.add(6);
		// if weadd the same that is not added 
		evenNumber.add(8);
		
		System.out.println("Hash set :" +evenNumber);
		
		Iterator<Integer> iterate = evenNumber.iterator();
		System.out.println("HashSet using Iterator :");
		
		//accessing elements
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		TreeSet<String> employeL = new TreeSet<>();
		employeL.add("Stark");
		employeL.add("Lanister");
		employeL.add("Turgarion");
		employeL.add("brthion");
		System.out.println("list of employees..."+employeL);
		
		HashSet<String> employeL1 = new HashSet<>();
		employeL1.add("Stark");
		employeL1.add("lanister");
		employeL1.add("turgarion");
		employeL1.add("Brthion");
		System.out.println("list of employees..."+employeL1);
		

	}

}
