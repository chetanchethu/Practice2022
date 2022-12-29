package com.practi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//TO represent email id
//[a-aA-Z0-9][A-Za-z0-9._]*@[a-zA-Z0-9]+ ([.][a-zA-z]+)+
//. should be inside [] i.e.,e [.]. Because only . represents "any character in regular expressions
public class RegularExpression1 {
	public static void main(String[] args) {
		
		String pat = "AABAAAAAABAA";
		String txt = "AB";
		Pattern p = Pattern.compile("[AB]");
		Matcher m = p.matcher(pat);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.println("found at "+ m.start()+ " end @"+
					m.end()+" group "+m.group());
		}System.out.println("no of occurences"+count);
	}
}
