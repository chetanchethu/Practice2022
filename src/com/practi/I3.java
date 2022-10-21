package com.practi;

public interface I3 extends I1,I2{

	@Override
	default void m1() {
		// TODO Auto-generated method stub
		I1.super.m1();
	}

}
