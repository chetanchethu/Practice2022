package com.codes;

import java.math.BigInteger;

public class BigIntegerAddition {

	public static void main(String[] args) {
		Integer n = 836;
		BigInteger a = BigInteger.valueOf(n);
		String o = "123";
		BigInteger b = new BigInteger(o);
		System.out.println(a.add(b));
	}

}
