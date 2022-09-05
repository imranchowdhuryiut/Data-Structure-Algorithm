package leetcode;

import java.util.Arrays;

public class MinCostClimbingStairs {

	public int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length];
		Arrays.fill(dp, -1);
		int a = findMinCostClimbingStairs(0, cost, dp);
		int b = findMinCostClimbingStairs(1, cost, dp);
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	private int findMinCostClimbingStairs(int position, int[] cost, int[] dp) {
		if (position == cost.length) {
			return 0;
		}
		if (position > cost.length) {
			return Integer.MAX_VALUE - 1000;
		}
		if (dp[position] != -1) {
			return dp[position];
		}
		dp[position] = 0;
		int a = findMinCostClimbingStairs(position + 1, cost, dp) + cost[position];
		int b = findMinCostClimbingStairs(position + 2, cost, dp) + cost[position];
		if (a > b) {
			dp[position] += b;
		} else {
			dp[position] += a;
		}
		return dp[position];
	}

}
