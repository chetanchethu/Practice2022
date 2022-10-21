package com.practi;

import java.util.HashMap;
import java.util.Map;

public class Y<T> {
	T value;

	public Y(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public static void main(String[] args) {
		Y<String> f = new Y<>("A string");
		Y<Integer> s = new Y<>(123);
		System.out.println(f.getValue());
		System.out.println(s.getValue());
	}
}
