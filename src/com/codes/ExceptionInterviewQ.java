package com.codes;

public class ExceptionInterviewQ {
	public static void main(String[] args) {
		try {
			System.out.println("sadghaskdh");
			throw new NullPointerException();
		} catch (RuntimeException e) {
			System.out.println("here");
		}

		catch (Exception ex) {
			System.out.println("saufhsdif");
		}

//		catch (NullPointerException n) {
//			System.out.println("nulllll");
//		}

	}
}
