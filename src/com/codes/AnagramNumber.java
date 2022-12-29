package com.codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramNumber {

	public static void main(String[] args) {
		String s="ab ab dog god";
		String[] sp=s.split(" ");
		int count=0;
		Map<String,Integer> hm=new HashMap<>();
		for (int i = 0; i < sp.length; i++) {
			String t=sp[i];
			char[] c=t.toCharArray();
			Arrays.sort(c);
			String re=new String(c);////////////////////////////////important
			if(!hm.containsKey(re)) {
				hm.put(re, 1);
				count++;
			}
			
		}System.out.println(count);
	}
}
