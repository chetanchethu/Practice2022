package com.codes;

import java.util.function.Function;
//To convert char to int first convert char to string and then parse
public class Apexon {
	static int finalRes=0;
	static boolean count=false;
	public static void main(String[] args) {
		String s="1234";

		int res=0;	
		for (int i = 0; i < s.length(); i++) {
	    int o=Integer.parseInt(String.valueOf(s.charAt(i)));
		int sq=o*o;
	    res+=sq;
		}
	    System.out.println(res);
	    int result=rec(res);
	    System.out.println(result);
	}

	private static int rec(int res) {
		if(count) {
			finalRes=0;
		}
		String p=String.valueOf(res);
		  for (int i = 0; i < p.length(); i++) {
				int q=Integer.parseInt(String.valueOf(p.charAt(i)));
				finalRes+=q;
			}
		String fr=String.valueOf(finalRes);
		if(fr.length()>1) {
			count=true;
			int temp=finalRes;
			rec(finalRes);
		}
		return finalRes;
	}

}
