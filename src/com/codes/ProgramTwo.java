package com.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*(Deloitte)
 * Input 471
 * a=47 so output is 471+71=542 since 471 and 71 are>a
 */
public class ProgramTwo {

	static Integer sum(String num, String x) {
		int result = 0;
		List<Integer> l = new ArrayList<>();
		int n = num.length();
		int c = Integer.parseInt(x);
		for (int i = 0; i < num.length(); i++) {

			for (int j = i + 1; j <= num.length() - 1; j++) {
				String t = num.substring(i, j + 1);
				int u = Integer.parseInt(t);
				if (u > c) {
					l.add(u);
				}
			}
		}
		for (int eachElement : l) {
			result += eachElement;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ProgramTwo.sum("122223", "97"));
	}
}
