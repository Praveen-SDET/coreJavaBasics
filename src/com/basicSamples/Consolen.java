package com.basicSamples;

import java.util.Scanner;

public class Consolen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		int number = input.nextInt();
		System.out.println("Integer You entered : " +number);
		
		System.out.println("Enter float :");
		float myFloat = input.nextFloat();
		System.out.println("Float You Entered : " +myFloat);
		
		System.out.println("Enter double :");
		double myDouble = input.nextDouble();
		System.out.println("Double You Entered : " +myDouble);
		
		System.out.println("Enter text :");
		String myString  = input.next();
		System.out.println("Text You Entered : " +myString);
		
		input.close();
		

	}

}
