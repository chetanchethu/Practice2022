package com.codes;

import java.util.HashMap;
import java.util.Map;

public class SumWithArray { 			

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int n = 9;
		boolean f=false;
		
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(m.containsKey(n-a[i])) {
				System.out.println(n-a[i]+" "+ a[i]);
			f=true;
			}
			m.put(a[i], 1);
		}
		if(f==false) {
			System.out.println("No pairs found");
		}
		
//      String result="";
//      for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]+a[j]==n) {
//					result+=a[i]+" "+a[j];
//				}
//			}
//		}

//      if(result!="") {
//      	System.out.println("numbers which make sum are "+result);
//      }else {
//      	System.out.println("No numbers make sum");
//      }
	}
}
