package com.codes;

public class AddWithoutPlus {

	public static void main(String[] args) {
		int num1=24;
		int num2=29;
//		while(num2!=0) {
//			int carry=num1 & num2;
//			num1=num1^num2;
//			num2=carry<<1;
//		}
//		System.out.println(num1);

		//SUbtraction without using - operator
		while(num2!=0) {
			int carry=(~num1)&num2;
			num1=num1 ^ num2;
			num2=carry << 1;
		}
		System.out.println(num1);
		
		
	}
	
	

}
