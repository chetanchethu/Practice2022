package com.codes;

public class GroupZeroOneTwo {

	public static void main(String[] args) {
		int a[]= {0,1,0,1,0,0,2,1};
	    int mid=0;  //4
	    int low=0,
	    high=a.length-1;
		while(mid<=high) {
			if(a[mid]==0) {
				int temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;mid++;
			}
			else if(a[mid]==1) {
		         mid++;
			}else {
				int temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
			}	
	}
		for(int u:a) {
			System.out.print(u+" ");
		}
	}

}
