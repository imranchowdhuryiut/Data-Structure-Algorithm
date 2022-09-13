package leetcode;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {

	public int minPairSum(int[] nums) {
		Arrays.sort(nums);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length / 2; i++) {
			int sum = nums[i] + nums[nums.length - 1 - i];
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

}
