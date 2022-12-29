package com.goldman;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
	public static void main(String[] args) {
		int[] arr= {1,1,1,1};
		int n = 4,k=2;
		 int c=0;
			Map<Integer, Integer> hm = new HashMap<>();
			for (int i = 0; i < n; i++) {
				if (!hm.containsKey(arr[i])) {
					hm.put(arr[i], 1);
				}else
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
			for (int i = 0; i < n; i++) {
			if(hm.get(k-arr[i])!=null) {
				c+=hm.get(k-arr[i]);//14
			}	if (k - arr[i] == arr[i])
					c--;//13
			}System.out.println(c/2);
	      
	}

}
