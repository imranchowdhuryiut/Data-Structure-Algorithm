package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubsetXORTotals {
	
	public int subsetXORSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum ^ nums[i];
		}
		return sum;
	}

	public int subsetXORSum2(int[] nums) {
		int sum = 0;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findSubsetXORSum(result, new ArrayList<Integer>(), 0, nums);
		for (int i = 0; i < result.size(); i++) {
			int xor = 0;
			for (int j = 0; j < result.get(i).size(); j++) {
				xor = xor ^ result.get(i).get(j);
			}
			sum = sum + xor;
		}
		return sum;
	}

	private void findSubsetXORSum(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int position,
			int[] nums
	) {
		// TODO Auto-generated method stub
		if (position == nums.length) {
			result.add(new ArrayList<>(comb));
			return;
		} if (position > nums.length) {
			return;
		}
		
		findSubsetXORSum(result, comb, position + 1, nums);
		
		comb.add(nums[position]);
		findSubsetXORSum(result, comb, position + 1, nums);
		comb.remove(comb.size() - 1);
	}

}
