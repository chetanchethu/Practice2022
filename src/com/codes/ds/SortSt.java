package com.codes.ds;

import java.util.Arrays;
import java.util.Comparator;

public class SortSt {

	static String sort(String st) {
		Character[] ch = new Character[st.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = st.charAt(i);
		}
		Arrays.sort(ch, new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
			}
		});
		StringBuilder sb = new StringBuilder(ch.length);
		for (Character j : ch) {
			sb.append(j);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String st = "doAksfavb";
		System.out.println(SortSt.sort(st));
	}
}
