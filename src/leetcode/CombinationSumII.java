package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSumII {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
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
		if (target == 0) {
			result.add(new ArrayList<>(comb));
			return;
		} else if (target < 0) {
			return;
		}
		for(int i = position; i < candidates.length; i++) {
			if(i > position && candidates[i] == candidates[i-1]) continue;
			if (candidates[i] <= target ) {
				comb.add(candidates[i]);
				findCombinationSum2(result, comb, i + 1, candidates, target - candidates[i]);
				comb.remove(comb.size() - 1);
			}
		}
	}
	
}
