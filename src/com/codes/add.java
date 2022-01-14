package com.codes;

public class add {

	public static void main(String[] args) {
		String s="84274";
		Integer a=Integer.parseInt(s);
	int re;
	int n;
	int r=0;
	while(a!=0) {
		re=a%10;
		r+=re;
		a/=10;
	
	}
System.out.println(r);
//addition without using arithmetic operator
System.out.println(Integer.sum(45, 2));
	}
	
			

}
