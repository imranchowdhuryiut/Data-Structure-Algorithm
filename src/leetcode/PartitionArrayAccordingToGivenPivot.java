package leetcode;

public class PartitionArrayAccordingToGivenPivot {

	public int[] pivotArray(int[] nums, int pivot) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < pivot ) {
				result[index] = nums[i];
				index++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == pivot ) {
				result[index] = nums[i];
				index++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > pivot ) {
				result[index] = nums[i];
				index++;
				if (index == result.length) {
					break;
				}
			}
		}
		return result;
	}	

}
