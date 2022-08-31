package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findCombinationSum2(result, new ArrayList<Integer>(), 0, candidates, target);
		return result;
	}

	private void findCombinationSum2(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int position,
			int[] candidates, 
			int target
	) {
		// TODO Auto-generated method stub
		if (comb.size() != 0) {
			int sum = 0;
			for(int j = 0; j < comb.size(); j++) {
				sum = sum + comb.get(j);
			}
			if (target == sum) {
				result.add(new ArrayList<>(comb));
				return;
			} else if (sum > target) {
				return;
			}
		}
		for(int i = position; i < candidates.length; i++) {
			comb.add(candidates[i]);
			findCombinationSum2(result, comb, i + 1, candidates, target);
			comb.remove(comb.size() - 1);
		}
	}

}
