package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findAllPossibleSubsets2(result, new ArrayList<Integer>(), 0, nums);
		return result;
	}

	private void findAllPossibleSubsets(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int position, 
			int depth,
			int[] nums
	) {
		// TODO Auto-generated method stub
		result.add(new ArrayList<>(comb));
		if (depth == nums.length) {
			return;
		}
		for (int i = position; i < nums.length; i++) {
			comb.add(nums[i]);
			findAllPossibleSubsets(result, comb, i + 1, depth + 1, nums);
			comb.remove(comb.size() - 1);
		}
	}
	
	private void findAllPossibleSubsets2(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int position,
			int[] nums
	) {
		// TODO Auto-generated method stub
		
		if (position == nums.length) {
			result.add(new ArrayList<>(comb));
			return;
		}
		findAllPossibleSubsets2(result, comb, position + 1, nums);
		
		comb.add(nums[position]);
		findAllPossibleSubsets2(result, comb, position + 1, nums);
		comb.remove(comb.size() - 1);
	}

}
