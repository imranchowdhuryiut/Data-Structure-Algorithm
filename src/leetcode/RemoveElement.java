package leetcode;

import java.util.Arrays;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				nums[i] = nums.length + 101;
				result++;
			}
		}
		Arrays.sort(nums);
		result = nums.length - result;
		return result;
	}

}
