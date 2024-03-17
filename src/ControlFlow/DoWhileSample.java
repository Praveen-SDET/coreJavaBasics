package ControlFlow;

import java.util.Scanner;

public class DoWhileSample {

	public static void main(String[] args) {
		int num ,sum =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		num =input.nextInt();
		do {
			sum+=num;
			System.out.println("Enter a number :");
			num =input.nextInt();
		}
		while(num>= 0);
		System.out.println("Sum = "+sum);
		input.close();
	}

}
