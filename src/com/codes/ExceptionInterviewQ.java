package com.codes;

public class ExceptionInterviewQ {
	public static void main(String[] args) {
		try {
			System.out.println("sadghaskdh");
			int a=2/0;
//			throw new NullPointerException();
		}
//		catch (NullPointerException n) {
//			System.out.println("nulllll");
//		}
		catch (RuntimeException e) {
			System.out.println("here");
		}
//		catch (Exception ex) {
//			System.out.println("saufhsdif");
//		}
		finally {
			System.out.println("h");
		}

	}
}
