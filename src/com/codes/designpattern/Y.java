package com.codes.designpattern;

public class Y extends X {
	@Override
	void method(double d) {
		System.out.println("THREE");
	}

	public static void main(String[] args) {
		new Y().method(100);
	}
}
