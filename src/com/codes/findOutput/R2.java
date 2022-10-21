package com.codes.findOutput;

public class R2 extends R1 {
	int x = 30;
	static int y = 40;
	static int z = 7;

	public void m1() {
		System.out.println("B m1()");
	}

	public static void m2() {
		System.out.println("B m2()");
	}

	public static void main(String[] args) {

		R1 g = new R2();
		g.m1();
		g.m2();
		System.out.println(g.x);
		System.out.println(g.y);
		//System.out.println(g.z); //CE error
	}

}
