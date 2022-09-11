package com.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class SortAlphabetInString {

	
	static String sort(String input) {
		Character[] t = new Character[input.length()];
		for (int i = 0; i < t.length; i++) {
			t[i] = input.charAt(i);
		}
		Arrays.sort(t, new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
			}
		});
		StringBuilder b = new StringBuilder(t.length);
		for (Character c : t) {
			b.append(c);
		}
		return b.toString();
	}

	public static void main(String[] args) {
		System.out.println(sort("BchetanAs"));
		// shortcut way when their are only lower or only upper case letters
		String y = "chetan";
		char[] u = y.toCharArray();
		Arrays.sort(u);
		System.out.println(new String(u));
	}
}
