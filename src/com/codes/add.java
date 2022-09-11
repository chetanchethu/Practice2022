package com.codes;

public class add {
//Addition with and without arithmetic operator
	public static void main(String[] args) {
		String s = "84274";
		int a = Integer.parseInt(s);
		int re;
		int r = 0;
		while (a != 0) {
			re = a % 10;
			r += re;
			a /= 10;
		}
		System.out.println(r);
//addition without using arithmetic operator
		System.out.println(Integer.sum(45, 2));
	}

}
