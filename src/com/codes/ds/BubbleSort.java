package com.codes.ds;

public class BubbleSort {
    public static void main(String args[]) 
    { 
    	BubbleSort ob = new BubbleSort(); 
        int arr[] = {0,1,0,2,3,0,0,1,1,1,0,1}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    }

	private void printArray(int[] arr) {
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i]);
}			
	}

	private void bubbleSort(int[] a) {
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-i-1; j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	} 
	
}
