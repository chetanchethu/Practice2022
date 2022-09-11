package com.codes;

//Find uncommon characters of the two strings
public class UncommonChars {
	static String findUnCommonChar(String a, String b) {
		String result = "";
		int max_char = 26;
		int present[] = new int[max_char];
		// mark as 0 everything
		for (int i = 0; i < present.length; i++) {
			present[i] = 0;
		}
		// mark 1 for elements present in String a
		for (int i = 0; i < a.length(); i++) {
			present[a.charAt(i) - 'a'] = 1;
		}
		//// if a character of b is also present
		// in a, then mark its presence as -1
		for (int j = 0; j < b.length(); j++) {
			if (present[b.charAt(j) - 'a'] == 1 || present[b.charAt(j) - 'a'] == -1) {
				present[b.charAt(j) - 'a'] = -1;
			} else {
				present[b.charAt(j) - 'a'] = 2;
			}

		}
         //add to result String
		for (int i = 0; i < max_char; i++) {
			if (present[i] == 1 || present[i] == 2) {
				result += ((char) (i + 'a'));
			}
		}
		if (result.length() == 0)
			return "-1";
		else
			return result;
	}

	public static void main(String[] args) {
		System.out.println(findUnCommonChar("characters", "characte"));
	}

}
