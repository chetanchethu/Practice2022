package com.codes;

public class SpclCharInString {

	public static void main(String[] args) {
		String s = "Cloud!1Te@!)a";
		int count = 0;
		String spclChar = "";
		String nonSPcl="";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
				spclChar += s.charAt(i);
			}
			else
				nonSPcl+=s.charAt(i);
		}
		if (count == 0)
			System.out.println("No Special characters found");
		else 
			System.out.println(spclChar);
		
		
		System.out.println("Non special characters: "+ nonSPcl);
	}
	

}
