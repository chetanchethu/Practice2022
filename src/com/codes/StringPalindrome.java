package com.codes;

public class StringPalindrome {
	
	static boolean isPal(String s) {

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		StringPalindrome p = new StringPalindrome();
		System.out.println(p.isPal("abba"));
	}
}
