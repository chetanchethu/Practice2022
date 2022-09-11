package com.codes;

//input String s1=ABCD s2=CDAB. check whether string s2 is rotation of s1 or not. 
public class StringRotation {
//SOolution append s1 twice i.e.,ABCDABCD. CHeck whether s1 contains s2
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAF";
		//System.out.println(s1.indexOf(s2));
		if(s1.length()!=s2.length()) {
			System.out.println("Not rotation of each other");
		}else {
			String s3=s1.concat(s1);
			if(s3.contains(s2)) {
				System.out.println("y");
			}else {
				System.out.println("N");
			}
		}
	}
	//OR
//	static boolean isRotation(String s1,String s2) {
//		return (s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1);//if its -1 then it means that s2 is present in substring of s1
//	}
}