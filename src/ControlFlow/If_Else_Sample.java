package ControlFlow;

public class If_Else_Sample {

	public static void main(String[] args) {
		int testscore=79;
		char grade;
		if(testscore>=90) {
			grade = 'A';
		}
		else if (testscore >= 80) { grade = 'B';}
		else if (testscore >= 70) { grade = 'C';}
		else if (testscore >= 60) { grade = 'd';}
		else {grade = 'F';}
		System.out.println("Grade = "+grade);

	}

}
