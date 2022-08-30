package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i] - 1]++;
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result.add(i + 1);				
			}
		}
		return result;
	}
	
}
