package com.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 45 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
