package com.codes;

import java.util.Arrays;

public class MergeArray {
	// int[] a = { 1, 2, 5, 8, 10 };
	 //int[] b = { 3,1, 4, 6,3, 7,9 };//output 1,1,2,3,3,4,5,6,7,8,9,10
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 8, 10 };
		int[] b = { 3, 4, 6, 7 };
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		for (int k2 = 0; k2 < c.length; k2++) {
			System.out.print(c[k2]);
		}
	
	}

}
