package com.practi;

public class X {
	public static Object method() {
		try {
			int i = 1 / 0;
			return i;
		} catch (ArithmeticException e) {
		e.printStackTrace();
		} finally {
			return "finally";
		}
	}

	public static void main(String[] args) {
		System.out.println(method());
	}
}
