package com.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Thompson reuters
public class MinmaxJavaEight {
	static void doprint(int[] a) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		System.out.println(list.stream().sorted().findFirst().get());
		List<Integer> li = new ArrayList<Integer>();
		li = list.stream().sorted().collect(Collectors.toList());
		System.out.println(li.get(li.size() - 1));
		//OR
//		System.out.println(li.stream().min(Integer::compare).get());
//		System.out.println(li.stream().max(Integer::compare).get());
	}

	public static void main(String args[]) {
		int[] a = { 1, 5, 10, 40, 0, 12 };
		doprint(a);
	}

}