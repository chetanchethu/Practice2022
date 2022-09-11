package com.codes;

import java.util.HashMap;
import java.util.Map;

public class GuessOutput2 {

	public static void main(String[] args) {
		int x = 5, y = 10;
		swap(x, y);
		System.out.println(x + " " + y);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
