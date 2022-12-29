package com.codes.findOutput;

//if a class contains abstract method then compulsorily that class has to be abstract. otherwise
//compile time error will be thrown

//We cannot create Object of abstract class. We can have constructor from where we can call 
//other non abstract methods present in abstract class or we can create object of child class 
//and call parent class method from their

//we can have static method in abstract class
public abstract class Ov {
	int o=82;
	static int q=92;
	Ov() {
		System.out.println("this is Ov");
	}
	Ov(int a){
		System.out.println("integer");
	}
	
	void b() {
		System.out.println("bbbbbbbbbb");
	}
	static void a() {
		System.out.println("static method in abstract class");
	}

	abstract void method();

	void m1() {
		System.out.println("void m1 method");
	}
	
}
