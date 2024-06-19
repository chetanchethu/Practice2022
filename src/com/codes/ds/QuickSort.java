package com.codes.ds;

//Best sorting algorithm with o(Nlogn) complexity
//users divide and conquer algo
//recursion
//pivot
//need arr,low,high, piv,i,j
public class QuickSort {

	public static void main(String[] args) {
		int a[]= {5,6,2,1,8};
		int l=a.length-1;
		quicksort(a,0,l);
		for(int n:a) {
			System.out.print(n+" ");
		}
		
	}

	private static void quicksort(int[] a, int low, int high) {
		if(low<high) {
			int pi=partition(a,low,high);
			quicksort(a, low, pi-1);
			quicksort(a, pi+1, high);
		}	
	}

	private static int partition(int[] a, int low, int high) {
		int pivot=a[high];
		int i=low-1;
		for (int j = low; j < high; j++) {
			if(a[j]<pivot) { //---this line not getting 
				i++;
				//swap i and j
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;;
			}
		}
		//swap i+1 and high
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return (i+1);
		}

}
