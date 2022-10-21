package com.practi;

public class B extends A {
	static {
		System.out.println("csb");
	}
	{
	System.out.println(	"cib");
	}
	public B() {
		System.out.println("B cons");
	}
public static void main(String[] args) {
	B b=new B();
}
}
