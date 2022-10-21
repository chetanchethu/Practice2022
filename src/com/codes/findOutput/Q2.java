package com.codes.findOutput;

public interface Q2 {

	void q2AbstractMethod();
	default void q2method() {
		System.out.println("Q2 default method");
	}
}
