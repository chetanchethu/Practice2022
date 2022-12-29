package com.practi;

public class X {

	public static void main(String[] args) {
		String[] s= {"a","b","c","d","e"};
		
		for (int i = 0; i < s.length/2; i++) {
			String temp=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=temp;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
