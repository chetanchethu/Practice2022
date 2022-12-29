package com.goldman;

import java.util.Arrays;

//Given an unsorted array.
//Find repeating number and smallest positive number
public class RepeatingSmallestPositive {
	
	static int[] find(int[] a,int n) {
		int[] ans=new int[2];
		Arrays.sort(a);
		for (int i = 0; i<n; i++) {
			int abs=Math.abs(a[i]);
			if(a[abs-1]>0)
				a[abs-1]=-a[abs-1];//0
			else
				ans[0]=abs;
		}
		for (int i = 0; i < n; i++) {
			if(a[i]>0)
				ans[1]=i+1;
		}return ans;
	}
	public static void main(String[] args) {
		int n=5;
		int[] a= {3,1,4,1,5};
		int[] b=find(a, n);
		for(int h:b) {
			System.out.print(h+" ");
		}
		//int[] a=1,3,3; Here output is 3 2
	}
}
           