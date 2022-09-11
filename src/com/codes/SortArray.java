package com.codes;

//program to sort 0,1and 2
public class SortArray {
	public static int[] sort012(int a[], int n) {
		int low = 0, high = n - 1, mid = 0;
		while (mid <= high) {
			if (a[mid] == 0) {
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
			} else if (a[mid] == 1) {
				mid++;
			} else {
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
			}
		}return a;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 0, 0, 2 };
		int n = 6;
	sort012(a, n);
	for(Integer num:a) {
		System.out.println(num);
	}
	}

}
