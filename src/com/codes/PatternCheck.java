package com.codes;

public class PatternCheck {

	public static void main(String[] args) {
		String pat = "AABAAAAAAAA";
		String txt = "AB";
		int i=0;
		for (int j=txt.length();j<pat.length();j++){
			if(txt.equals(pat.substring(i,j))) {
				System.out.println("found at "+i);
			}
			i++;
			}
	
	}

}
