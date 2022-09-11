package com.codes;

import java.util.Arrays;

/*
 * Consider a game where a player can score 3 or 5 or 10 points in a move. 
 * Given a total score n, find number of distinct combinations to reach the given score.
 * Example:
Input
8
20
13
Output
1
4
2
Explanation
For 1st example when n = 8
{ 3, 5 } and {5, 3} are the 
two possible permutations but 
these represent the same 
combination. Hence output is 1.
 */
public class ReachScore {
	static long count(int n) {//n=8                3 5 10
		long[] dp = new long[(int) n + 1]; //dp.lenghth=9    
		Arrays.fill(dp, 0);
		dp[0] = 1;
		for (int i = 3; i <= n; i++)
			dp[i] += dp[i - 3];              
		for (int i = 5; i <= n; i++)
			dp[i] += dp[i - 5];
		for (int i = 10; i <= n; i++)
			dp[i] += dp[i - 10];

		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(ReachScore.count(13));
	}
}
