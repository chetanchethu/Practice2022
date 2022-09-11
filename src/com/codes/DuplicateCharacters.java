package com.codes;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

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

	}
}
