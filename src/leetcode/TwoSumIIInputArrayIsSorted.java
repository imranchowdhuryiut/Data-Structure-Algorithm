package leetcode;

public class TwoSumIIInputArrayIsSorted {

	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int low = 0;
		int high = numbers.length - 1;
		
		while (low <= high) {
			int sum = numbers[low] + numbers[high];
			if (sum == target) {
				result[0] = low + 1;
				result[1] = high + 1;
				break;
			}
			
			if (sum > target) {
				high = high - 1;
			} else {
				low = low + 1;
			}
		}
		
		return result;
	}

}
