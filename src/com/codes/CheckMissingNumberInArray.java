package com.codes;

//input:int[] a={1,2,5,4} N=5 Find missing number ouput 3
public class CheckMissingNumberInArray {
	static int find(int[] a, int n) {
		int sumOfNos = (n * (n + 1)) / 2; // 15
		int sumOfArray = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfArray += a[i]; // 11
		}
		return sumOfNos - sumOfArray;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5 };
		System.out.println(find(a, 5));
	}

}
