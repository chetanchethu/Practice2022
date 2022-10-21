package com.codes.designpattern;

import java.io.NotSerializableException;

public class Singleton implements Cloneable {
	// Eager
//	private static Singleton instance=new Singleton();
//	private Singleton() {
//	}
//	public Singleton getInstance() {
//		return instance;
//	}

	// for multithreaded environment
//	private volatile static Singleton instance;
//
//	private Singleton() {
//	}
//	public Singleton getInstance() {
//		if (instance == null) {
//			synchronized (Singleton.class) {
//				if (instance == null) {
//					instance = new Singleton();
//				}
//			}		
//		}
//		return instance;
//	}

	// for normal class
	private volatile static Singleton instance;

	private Singleton() {
		// 1 preventing from refletion
		// throw new IllegalStateException("object cannot be created using reflection");
	}

	public Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// for ways to breaking of singleton see MainMethod.java
	@Override
	protected Singleton clone() throws CloneNotSupportedException {
		// preventing from cloning
		// throw new CloneNotSupportedException("clone not supported");
		return (Singleton) super.clone();
	}

	//3 to prevent breaking from serialization and deserialiation
	protected Object readresolve() {
		return instance;
	}

}