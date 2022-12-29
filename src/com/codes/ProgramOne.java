package com.codes;
/*
 * Program to reverse words in a String
 * Input : I,am,a,java,professional
 * Output: professional,java,a,am,I
 */
public class ProgramOne {

	static String reverse(String s) {
		String result="";
		String[] splitString=s.split(",");
	StringBuffer buffer=new StringBuffer();
		for (int i = splitString.length-1; i>=0; i--) {
			buffer.append(splitString[i]);
			result+=splitString[i];
			if(i!=0) {
				buffer.append(",");
				result+=",";
			}
		}
		return buffer.toString();
	}

	
	public static void main(String[] args) {
System.out.println(ProgramOne.reverse("I,am,a,java,professional"));
	}
}
