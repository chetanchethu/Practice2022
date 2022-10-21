package com.practi;

public class E<N> {
	void add(N t) {

	}

	public static void main(String[] args) {
		E<Number> e1 = new E<>();
		e1.add(new Integer(1));
		e1.add(new Double(1.0));

	}

}
