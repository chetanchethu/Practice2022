package com.codes;

public class PatternCheck {

	public static void main(String[] args) {		
		String pat = "AABAACAADAABAAABAAa";
		String txt = "AABA";
		int l1=pat.length();
		int l2=txt.length();
		int i=0;
		for (int j=l2;j<l1;j++){{
			if(txt.equals(pat.substring(i,j))) {
				System.out.println("found at"+i);
			}
			i++;
				
			}
		}

	}

}
