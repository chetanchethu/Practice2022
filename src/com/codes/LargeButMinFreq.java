package com.codes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

/*
 * LargButMinFreq(A, n) which accepts array A and n. 
 * Hence you have to return the largest element with minimum frequency.
 *Input:
1
5
2 2 5 50 1

Output:
50
All elements are having frequency 1 except 2.
 50 is the maximum element with minimum frequency.
//Note: use HashMap to compute the element and its frequency.
 */
public class LargeButMinFreq {
	public static void main(String[] args) {
		int[] a= {2 ,2 ,5 ,50, 50,75,75,50,45,1};
		HashMap<Integer, Integer>hm=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			if(hm.containsKey(temp)) {
				//int freq=hm.get(temp);
				//hm.put(temp, ++freq);  // ALL // is used to calculate max frequency
				//freq++;	
			}else {
				hm.put(temp, 1);
		}
		}
		//System.out.println(hm);
//		int maxFreq=Integer.MIN_VALUE; 
//		int r=Integer.MIN_VALUE;
//		for(Map.Entry<Integer,Integer> entry:hm.entrySet()) {
//			if(maxFreq<=entry.getValue() && r<entry.getKey()) {
//				maxFreq=entry.getValue();
//				 r=entry.getKey();
//			}
//		}System.out.println(maxFreq+"   "+r);
		
		int minFrequency=Integer.MAX_VALUE;
		int resultKey=-1;
		for(Map.Entry<Integer,Integer> entry:hm.entrySet()) {
			  if(minFrequency>=entry.getValue() && resultKey<entry.getKey()) {
				  minFrequency=entry.getValue();
				  resultKey=entry.getKey();
			  }
		}
	System.out.println(resultKey);
	}	
}
