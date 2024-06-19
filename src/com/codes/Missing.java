package com.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Accolite 
 */
public class Missing {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2,  4, 6, 7, 8, 10 };
		List<Integer> li = new ArrayList<Integer>();
		int o = a[0];
		for (int i = a.length - 1; i >= 0; i--) {
			int res = a[a.length - 1] - o;
			if (a[i] != res) {
				li.add(res);
				i++;
			}
			o++;
		}
		System.out.println(li.stream().sorted().collect(Collectors.toList()));
	}
}