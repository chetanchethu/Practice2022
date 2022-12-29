package com.codes;

public class SumOfPositive {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, -7, 6, 8, 1, -10, 15 };// 39
		System.out.println(calculate(a));
	}

	private static int calculate(int[] a) {
		int result = 0;
		int count = 0;
		int i = 0;
		while (count < a.length) {
			if (a[i] > 0)
				result += a[i];
			count++;
			i++;
		}
		return result;
	}

}
