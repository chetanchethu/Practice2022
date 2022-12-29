package com.codes;

public class ExceptionInterviewQ {
	public static void main(String[] args) {
		try {
			System.out.println("start");
			int a=2/0;
			throw new ArithmeticException("kjij");
		}
		
		catch (RuntimeException e) {
			System.out.println("here");
		}
		catch (Exception ex) {
			System.out.println("root Exception");
		}
		finally {
			System.out.println("h");
		}
		

	}
}
