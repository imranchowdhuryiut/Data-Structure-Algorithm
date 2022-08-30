package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length;) {
			int j = i + 1;
			while (j < nums.length && nums[i] == nums[j]) {
				nums[j] = 999;
				j++;
				count++;
			}
			i = j;
		}
		Arrays.sort(nums);
		return nums.length - count;
	}

}
