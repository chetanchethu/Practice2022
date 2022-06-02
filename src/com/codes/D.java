package com.codes;

public class D extends C {

	Float m1() {
		return 28.1f;
	}

	// Note Number can be converted to any of the primitive data types but not
	// string.
	// Java supports* covariant return types (Yes, if they return a subtype) for
	// overridden methods. This means an overridden method may have a more specific
	// return type
	D() {
		System.out.println("constructor");
	}

	static {
		System.out.println("static");
	}
	{
		System.out.println("iib");
	}

	public static void main(String[] args) {
		C c = new D();
		System.out.println(c.m1());
	}
}
