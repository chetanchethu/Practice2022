package com.codes;

//how to call A method from B
public class B extends A {
//1//      {
//		super.m1();
//	}

//2//	B() {
//		super.m1();
//
//	}

	void m1() {
		// 3//super.m1();
		System.out.println("B called");
	}

	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}
}
