package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findSubsetsWithDup2(result, new ArrayList<Integer>(), 0, nums);
		return result;
	}

	private void findSubsetsWithDup(
			Set<ArrayList<Integer>> result, 
			ArrayList<Integer> comb, 
			int position, 
			int[] nums
	) {
		// TODO Auto-generated method stub
		if (position == nums.length) {
			ArrayList<Integer> newList = new ArrayList<>(comb);
			Collections.sort(newList);
			result.add(new ArrayList<>(newList));
			return;
		}
		findSubsetsWithDup(result, comb, position + 1, nums);
		
		ArrayList<Integer> prevList = new ArrayList<>();
		for (int i = position; i < nums.length; i++) {
			if (!prevList.contains(nums[i])) {
				comb.add(nums[i]);
				prevList.add(nums[i]);
				findSubsetsWithDup(result, comb, i + 1, nums);
				comb.remove(comb.size() - 1);
			}
		}
		
	}
	
	private void findSubsetsWithDup2(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int position, 
			int[] nums
	) {
		// TODO Auto-generated method stub
		result.add(new ArrayList<>(comb));
		if (position == nums.length) {
			return;
		}
		for (int i = position; i < nums.length; i++) {
			if (i != position && nums[i] == nums[i - 1] ) {
				continue;
			}
			comb.add(nums[i]);
			findSubsetsWithDup2(result, comb, i + 1, nums);
			comb.remove(comb.size() - 1);
		}
	}

}
