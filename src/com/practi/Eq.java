package com.practi;

import java.lang.reflect.Constructor;

public class Eq {

	private volatile static Eq singleton;

	private Eq() {

	}

	public static Eq getInstance() {
		if (singleton == null) {
			synchronized (Eq.class) {
				if (singleton == null) {
					singleton = new Eq();
				}
			}
		}
		return singleton;
	}

	public static void main(String[] args) throws Exception {
		int e1 = Eq.getInstance().hashCode();
		int e2 = Eq.getInstance().hashCode();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1 == e2);
	
	Class<?> className=(Class<?>)Class.forName("com.practi.Eq.class");
	Constructor<?> cons=className.getDeclaredConstructor();
	cons.setAccessible(true);
	Eq e3=(Eq) cons.newInstance();
	System.out.println(e3.hashCode());
	}

}
