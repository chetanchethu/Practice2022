package com.codes;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
//2ways we have
	public static void main(String[] args) {
		String s1 = "geeksforgeeks"; // geks
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (!m.containsKey(s1.charAt(i))) {
				m.put(s1.charAt(i), 1);
			} else {
				m.put(s1.charAt(i), m.get(s1.charAt(i))+1);
			}
		}

		for (Map.Entry<Character, Integer> e : m.entrySet()) {
			if (e.getValue() != 1) {
				System.out.print(e.getKey());
			}
		}
		System.out.println();
		int[] charFreq=new int[256];
		for(char c:s1.toCharArray()) {
			charFreq[c]++;
		}
		for (int i = 0; i < charFreq.length; i++) {
			if(charFreq[i]>1) {
				System.out.print((char)i+"-"+charFreq[i]+" times   ");
			}
		}

		//program to find 1st unique character
		String h="maxlblsohmaxu";	
		for (int i = 0; i < h.length(); i++) {
			char c=h.charAt(i);
			if(h.indexOf(c)==h.lastIndexOf(c)) {
				System.out.println( h.charAt(i));
				break;
			}
		}
		
	}
}
