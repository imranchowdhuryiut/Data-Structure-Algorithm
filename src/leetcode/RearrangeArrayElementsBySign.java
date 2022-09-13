package leetcode;

public class RearrangeArrayElementsBySign {

	public int[] rearrangeArray(int[] nums) {
		int[] result = new int[nums.length];
		int positiveIndex = 0;
		int negetiveIndex = 1;
		int index = 0;
		while (index < nums.length) {
			if (nums[index] > 0) {
				result[positiveIndex] = nums[index];
				positiveIndex += 2;
			} else {
				result[negetiveIndex] = nums[index];
				negetiveIndex += 2;
			}
			index++;
		}
		return result;
	}

}
