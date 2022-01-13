package com.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Print alternate even nos and alternate odd nos
 */
public class AlternateEvenNosOddNos {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<Integer> olist=new ArrayList<>();
		for (int i = 1; i < 21; i++) {
			if(i%2==0) {
				list.add(i);
			}
			else
				olist.add(i);
		}
	list=list.stream().filter(i->i%4!=0).collect(Collectors.toList());
	olist=list.stream().map(i->i-1).collect(Collectors.toList());
	System.out.println("Alternate Even numbers "+list);	
	System.out.println("Alternate Odd numbers  "+olist);
	}}
