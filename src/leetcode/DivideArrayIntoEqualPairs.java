package leetcode;

public class DivideArrayIntoEqualPairs {

	public boolean divideArray(int[] nums) {
		int[] countArr = new int[500];
		for (int i = 0; i < nums.length; i++) {
			countArr[nums[i] - 1]++;
		}
		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] % 2 != 0 ) {
				return false;
			}
		}
		return true;
	}

}
