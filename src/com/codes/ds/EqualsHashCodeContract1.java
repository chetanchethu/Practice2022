package com.codes.ds;

public class EqualsHashCodeContract1 {

	public static void main(String[] args) {
		EqualsHashCodeContract2 e1 = new EqualsHashCodeContract2();
		e1.setId(1);
		e1.setSalary("100");
		EqualsHashCodeContract2 e2 = new EqualsHashCodeContract2();
		e2.setId(1);
		e2.setSalary("100");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}