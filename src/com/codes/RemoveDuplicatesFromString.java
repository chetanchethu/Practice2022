package com.codes;

import java.util.*;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String s = "abchbsh";// abchs
		String h = "";
		int z = 1;

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!m.containsKey(s.charAt(i))) {
				h += s.charAt(i);
				m.put(s.charAt(i), 1);
			}
		}
		System.out.println(h);
                          //OR (using indexof method)
//		 (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (h.indexOf(c) < 0) {
//				h += c;
//		}
//		}
//		System.out.println(h);
		
	}
}