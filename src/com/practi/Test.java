package com.practi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1};
		int count=0;
		Map<Integer,Integer> hm=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			
		}
	}

}