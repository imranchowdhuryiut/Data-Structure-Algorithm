package leetcode;

import java.util.Arrays;

public class ClimbingStairs {
	public int climbStairs(int n) {
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		return reachTop(0, n, dp);
	}

	private int reachTop(int position, int n, int[] dp) {
		if (position == n) { 
			return 1;
		} 
		if (position > n) {
			return 0;
		} 
		if (dp[position] != -1) {
			return dp[position];
		}
		dp[position] = 0;
		dp[position] += reachTop(position + 1, n, dp);
		dp[position] += reachTop(position + 2, n, dp);
		return dp[position];
	}

}
