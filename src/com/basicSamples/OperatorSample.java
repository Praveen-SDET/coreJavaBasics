package com.basicSamples;

public class OperatorSample {

	public static void main(String[] args) {
		int a = 10,b = 5;
		System.out.println("a + b = " +(a+b));
		System.out.println("a - b = " +(a-b));
		System.out.println("a / b = " +(a%b));
		int result1;
		result1 = ++a;
		System.out.println("After Increment :" +result1);
		int result2;
		result2 = b--;
		System.out.println(" after decrement : " +result2);
		int ac = 6;
		int rac;
		rac = ac;
		System.out.println(+rac);
		rac += ac;
		System.out.println("rac using + " +rac);
		rac *= ac;
		System.out.println(" multiplication : " +rac);
		
	}

}
