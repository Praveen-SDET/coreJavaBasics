package ControlFlow;

public class BreakSample {

	public static void main(String[] args) {
		int [] array = { 34,4,56,12,1067,36};
		int searchfor = 12;
		int i=0;
		boolean foundit = false;
		for(; i<array.length; i++) {
			if(array[i] == searchfor) {
				foundit = true;
				break;
			}
			if(foundit) {
				System.out.println("The numer is found in the index" +i);
			}
			else { System.out.println("Number is  not in the index");}
		}
		

	}
}