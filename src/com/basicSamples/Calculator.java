package com.basicSamples;

public class Calculator {
        int number;
        static int c;
        int a;
        
        final double pi = 3.14;
        
        
        public void add(int a, int b) {
        	System.out.println("Value of a .."+ a++);
        	System.out.println("Value of a .."+ a);
        	
        	System.out.println("Value of b .."+ ++b);
        	a = a+1;
        	a +=1;
        	
        	int sum;
        	sum =a+b;
        	System.out.println(a+b);
        	
        }
        
        public void area(double radius) {
        //	pi = 5.23;
        	double area = pi*radius*radius;
        }
		public static void main(String[] args) {
			Calculator calObj = new Calculator();
			calObj.add(10, 25);
			c = 15;
		}

}
