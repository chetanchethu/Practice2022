package com.codes;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 5672;
		int rev = 0;
		int rem = 0;
		int sum=0;
		while (num !=0) {
			rem =  num % 10;
			sum+=rem;
			rev =rev*10+rem;
			num /= 10;
		}
		System.out.println(rev);System.out.println(sum);
	}

}
