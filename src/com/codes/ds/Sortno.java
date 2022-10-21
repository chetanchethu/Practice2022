package com.codes.ds;

import java.util.Arrays;
import java.util.List;

public class Sortno {

	static void remove(int[] a) {

	}

	public static void main(String[] args) {
		int[] a = { 6,6,3,1,2,5,2 };//1,2,3,5,6
		Arrays.sort(a);
		int[] t = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				t[j] = a[i];
				j++;
			}
		}
		t[j++]=a[a.length-1];
		for (int i = 0; i < t.length; i++) {
			a[i] = t[i];
		}
		for (int i = 0; i < j; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
