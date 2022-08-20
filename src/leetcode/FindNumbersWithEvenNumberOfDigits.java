package leetcode;

public class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			int digitCount = String.valueOf(nums[i]).length();
			if (digitCount % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}
