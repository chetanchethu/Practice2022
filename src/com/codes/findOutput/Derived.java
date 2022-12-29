package com.codes.findOutput;

public class Derived extends Base {
	Derived(){
		super("chetan");
		System.out.println("Derived constructor");
	}
	
	public void baseMethod()

	{
		System.out.println("Derived method called ...");
	}
}
