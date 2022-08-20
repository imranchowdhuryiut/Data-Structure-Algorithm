package leetcode;

public class SquaresOfASortedArray {

	public int[] sortedSquares(int[] nums) {
		int[] array = new int[nums.length];
		int low = 0;
		int high = nums.length - 1;
		int position = nums.length - 1;
		while (low <= high) {
			int a = (int) Math.pow(nums[low], 2);
			int b = (int) Math.pow(nums[high], 2);
			if (a < b) {
				array[position] = b;
				high--;
			} else {
				array[position] = a;
				low++;
			}
			position--;
		}
		return array;
	}

}
