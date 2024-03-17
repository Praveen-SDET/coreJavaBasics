package ControlFlow;

public class FibinaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// { 0 1 1 2 3 5 8}
		int num1 =0, num2=1,num3,i;
		int countof = 8;
		System.out.print(num1+" "+num2);
		for(i=2; i<countof;i++) {
			// first two numbers(0,1) are printed so we go from 2
			num3= num1+num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}
		

	}

}
