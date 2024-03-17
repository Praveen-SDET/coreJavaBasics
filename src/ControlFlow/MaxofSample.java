package ControlFlow;

public class MaxofSample {

	public static void main(String[] args) {
		int[] arr = { 10,25,100,125,99,560,2,11};
		int greater = arr[0];
		for(int i=0;i<=arr.length;i++) {
			if( arr[i] > greater) {
				greater = arr[i];
			}
			
		}
		System.out.println("Greater number is :" +greater);

	}

}
