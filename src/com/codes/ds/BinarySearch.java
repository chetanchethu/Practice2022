package com.codes.ds;

import java.util.Arrays;

public class BinarySearch {

	public static int m(int[] a,int x) {
		Arrays.sort(a);
		int right=a.length-1;
		int left=0;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(a[mid]==x) 
				return mid;
			
			if(a[mid]<x) //1,2,3,4,5
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8};
		int x=8;
		System.out.println(m(a, x));
		
	}
}
