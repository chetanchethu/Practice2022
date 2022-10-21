package com.practi;

public class P extends O {
	P() {

	}

	P(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		P p=new P("abc");
	}

}
