package com.goldman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groupingzeroonetwo {
public static void main(String[] args) {
	
	int[] a= {0,1,0,0,1,1,2,0};
	int n=a.length;
	int min=0,mid=0,end=n-1;
	while(mid<=end) {
		if(a[mid]==0) {
			int temp=a[mid];
			a[mid]=a[min];
			a[min]=temp;
			min++;
			mid++;
		}
		else if(a[mid]==1) {
			mid++;
		}
		else {
			int temp=a[mid];
			a[mid]=a[end];
			a[end]=temp;
			end--;
		}
	}
	for(int u:a) {
		System.out.print(u+" ");
	}
}
}

