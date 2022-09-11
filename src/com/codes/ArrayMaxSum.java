package com.codes;
//Kadane's algorithm
public class ArrayMaxSum {
	public static void main(String[] args) {
		int[] a= {1,2,3,-2,5};  //9
		int n=5;
		int currSum=0;
		int max=0;
		for (int i = 0; i < a.length; i++) {
			currSum+=a[i];
			if(currSum>max) {
				max=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
	System.out.println(max);

	}
}
