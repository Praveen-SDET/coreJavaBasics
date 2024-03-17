package ControlFlow;

public class ForEachSample {

	public static void main(String[] args) {
		int[]  nums = { 1,9,0,4,1,5,3,2,1};
		int sum = 0;
		for(int n : nums) {
			sum+=n;
		}
		System.out.println(" sum is " +sum);
		

	}

}
