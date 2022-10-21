package com.codes.findOutput;

public interface P extends Q2, Q1 {
	void p();
	default void qq() {
		Q1.super.q1method();	
	}

}
