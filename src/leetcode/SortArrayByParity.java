package leetcode;

public class SortArrayByParity {
	
	public int[] sortArrayByParity(int[] nums) {
		int n= nums.length / 2;
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			if (nums[low] % 2 == 0 && nums[high] % 2 == 1) {
				low++;
				high--;
			} else if (nums[low] % 2 == 1 && nums[high] % 2 == 0) {
				int temp = nums[low];
				nums[low] = nums[high];
				nums[high] = temp;
				low++;
				high--;
			} else if(nums[low] % 2 == 0 && nums[high] % 2 == 0) {
				low++;
			} else {
				high--;
			}
		}
		return nums;
	}
	
}
