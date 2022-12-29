package com.goldman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//To find minimum no of platforms required
public class TrainPlatforms {

	public static void main(String[] args) {
		int arr[] = { 100, 300, 500 };
		int dep[] = { 900, 400, 600 };//400,600,900
		int n = 3;
		//first u have to sort it both arrival and deprture.
		//Note ask intervier whether arrival is sorted
		int max_platform=1; int min=1;
		int i=1, j=0;
		while(i<n && j<n) {
			if(arr[i]<=dep[j]) {
				min++;
				i++;
			}else if(arr[i]>dep[j]) {
				min--;
				j++;
			}
			if(min>max_platform) {
				max_platform=min;
			}
			
		}System.out.println(max_platform);

	}
}