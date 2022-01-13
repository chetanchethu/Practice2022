package com.codes;

import java.util.Iterator;
/*
 * sort and add +1 to array
 */
public class ProgramThree {
	
	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int temp=i;
			for (int j = i+1; j < a.length; j++) {
			
				if(a[i]>a[j]) {
					temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
				}
			}
		}plusOne(a);
		return a;
	}
	static void plusOne(int[] a) {
		for (int i = 0; i < a.length; i++) {
		a[i]+=1;
		}
	}
	
	public static void main(String[] args) {
 int[] a= {2, 1, 9,3,4,1};
		int[] r=ProgramThree.sort(a);
//	ProgramThree.print(ProgramThree.sort(a));
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]+" ");
		}
	}
}
