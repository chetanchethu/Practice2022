package com.codes;
import java.util.Scanner;

/*
 * lost word in string and no of words in string
 */
public class PrintLostWord {
	public static void main(String args[])
	{
	String string = "Hello,This,is,the,lost,word";//word
	System.out.println(string);
    System.out.println("Last word is :"+string.substring 
    		(string.lastIndexOf (','),string.length())
    .replace(',', '\s').trim());
	
    System.out.println(string.split(",").length);//No of words
	}
}
