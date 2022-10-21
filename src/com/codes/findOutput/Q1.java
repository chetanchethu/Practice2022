package com.codes.findOutput;

public interface Q1 {

	void q1AbstractMethod();
	default void q1method() {
		System.out.println("Q1 default method");
	}
	
	static void dmethod() {
		System.out.println("Q1 default method");
	}
}
