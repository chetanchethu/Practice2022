package com.codes.findOutput;

public class Ov1 extends Ov {
	public Ov1() {
		super(2);
		System.out.println("this is called");
	}
	

	@Override
	void method() {
		System.out.println("overridden abstract method");

	}

	void m1() {
		System.out.println("void m1 method from derive");
	}

	public static void main(String[] args) {
		Ov1 v = new Ov1();
		Ov.a();
		v.b();
		int i=Ov.q;
		int pp=v.o;
		
	}

}
