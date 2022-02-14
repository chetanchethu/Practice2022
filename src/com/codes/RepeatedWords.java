package com.codes;

import java.util.HashMap;
/**
 * ThomsonReuters
 */
public class RepeatedWords {

	static void prin(String a) {
		String[] b=a.split(" ");
		HashMap<String, Integer> hm=new HashMap<>();
		for (int i = 0; i < b.length; i++) {
			if(!hm.containsKey(b[i])) {
				hm.put(b[i], 1);
			}else {
				hm.put(b[i], hm.get(b[i])+1);
			}
		}System.out.print(hm);
	}
	public static void main(String[] args) {
		String a= "foo baa foo"; //foo2 baa1
		prin(a);
	}
}
