package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubsetsII {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findSubsetsWithDup(result, new ArrayList<Integer>() new ArrayList<Integer>(), 0, nums);
		return result;
	}

	private void findSubsetsWithDup(
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
		findSubsetsWithDup(result, comb, position + 1, nums);
		
		ArrayList<Integer> prevList = new ArrayList<>();
		if (!prevList.contains(nums[position])) {
			comb.add(nums[position]);
			prevList.add(nums[position]);
			findSubsetsWithDup(result, comb, position + 1, nums);
			comb.remove(comb.size() - 1);
		}
		
	}

}
