package com.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove duplicates and add all elements using stream api.
public class Javae {
	
	static void doPrint(int[] a) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		System.out.println(list.stream().distinct().reduce((c,e)->c+e).get());
		
	}

	public static void main(String[] args) {
		int[] a= {1,2,4,6,1,3,2}; //2,4,6//1 2 3 4 6
		doPrint(a);
	}

}
