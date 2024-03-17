package ClassesAndObjects;

public class Array {

	public static void main(String[] args) {
		int [] age = {12, 3, 4, 5, 10};
		System.out.println("Accessing Elements of Array");
		System.out.println("First Element :" + age[0]);
		System.out.println("Second Element :" + age[1]);
		System.out.println("Third Element :" + age[2]);
		
		System.out.println("Length of the array :" +age.length);
		int sum = 0;
		for (int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		for(int num: age) {
			sum+=num;
		}
		System.out.println("Sum is  " +sum);
		
		int [][] twodim = {
				{ 3,5,7},
				{8,2,1,2},
				{6},
		};
		System.out.println(" Length of Row 1:  " + twodim[0].length);
		System.out.println(" Length of Row 2:  " + twodim[1].length);
		System.out.println(" Length of Row 3 :  " + twodim[2].length);
		
		String str[] = { "arun","ranjith","venkat"};
		System.out.println(" Length of array " +str[0]);
	}

}
