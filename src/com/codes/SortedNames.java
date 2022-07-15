package com.codes;

import java.io.*;

public class SortedNames {
	// Java Program to Sort Names in an Alphabetical Order
	public static void main(String[] args)
		{
			int n = 4;
			String names[]
				= { "Rahul", "Ajay", "Gourav", "Riya" };
			String temp;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (names[i].compareTo(names[j]) > 0) {
						temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}
			
//CompareTo() is used to compare two strings lexicographically. Each character of 
//both strings is converted into its unicode value. Lexicographical order is nothing
			//but alphabetical order. 
//This method returns an int data-type which is based on the comparison between the
//two string. If it returns>0 then the parameter passed to compareTo() method is
//lexicographically first whereas if returns < 0 then string calling the method is
			//lexicographically correct.
			
			
			
			// print output array
			System.out.println(
				"The names in alphabetical order are: ");
			for (int i = 0; i < n; i++) {
				System.out.println(names[i]);
			}
		}
}
