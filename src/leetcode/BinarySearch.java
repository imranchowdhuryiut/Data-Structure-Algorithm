package leetcode;

public class BinarySearch {

	public int search(int[] nums, int target) {
		int low = 0;
		int index= -1;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				index = mid;
			}
			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return index;
	}

}
