package com.codes.ds;

public class BalancedParanthesis {
	static boolean valid(String s) {
		java.util.Stack<Character> st = new java.util.Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				st.push(ch);
//			else if ((ch == ')' || ch == '}' || ch == ']') && st.empty())
//				return false;
			else if ((ch == ')' && st.peek() != '(') || (ch == '}' && st.peek() != '{')
					|| (ch == ']' && st.peek() != '['))
				return false;
			else
				st.pop();
		}
		if (st.size() == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(valid("({[]})"));
	}

}
