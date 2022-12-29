package com.codes;

import java.util.*;
import java.util.Map.Entry;

public class TrainTick {

	static void print(Map<String, String> data) {
		Map<String, String> rev = new HashMap<>();
		for (Entry<String, String> entry : data.entrySet()) {
			rev.put(entry.getValue(), entry.getKey());
		}
		String start = null;
		for (Entry<String, String> entry : data.entrySet()) {
			if (!rev.containsKey(entry.getKey())) {
				start = entry.getKey();
				break;
			}
		}
		String to = data.get(start);
		while (to != null) {
			System.out.println("Start -> " + start + " to-> " + to);
			start = to;
			to = data.get(to);
		}

	}

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("chennai", "Bangalore");
		m.put("Bombay", "Delhi");
		m.put("goa", "chennai");
		m.put("Delhi", "goa");
	print(m);}

}
