package ControlFlow;

public class SwitchSample {

	public static void main(String[] args) {
		int month = 2;
		int year = 2000;
		int numDays =0;
		
		switch(month) {
		case 1 : 
			month =1;
		case 2 :
			month =2;
			if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				System.out.println("This year is LEAP YEAR");
			}
			else {
				System.out.println("This year is NOT a LEAP YEAR");
			}
		case 3 :
			month =3;
			numDays = 31;
			break;
		case 4 :
			month =4;
			numDays = 30;
			break ;
		case 5 :
		case 6 :
		case 7 :
		case 8 :
		case 9 :
		case 10 :
		case 11 :
		case 12 :
		}

	}

}
