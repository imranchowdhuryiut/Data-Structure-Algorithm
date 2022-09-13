package leetcode;

import java.util.ArrayList;
import java.util.List;


public class CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findCombinationSum(result, new ArrayList<Integer>(), 0, candidates, target);
		return result;
	}

	private void findCombinationSum(
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
		}
		if (position == candidates.length) {
			return;
		}
		
//		for(int i = startPosition; i < candidates.length ;i++) {
//			comb.add(candidates[i]);
//			findCombinationSum(result, comb, depth + 1, i , candidates, target - candidates[i]);
//			comb.remove(comb.size() - 1);
//			
//		}
		findCombinationSum(result, comb, position + 1, candidates, target);
		int sum = 0;
		int count = 0;
		while (sum + candidates[position] <= target) {
			sum = sum + candidates[position];
			count++;
			comb.add(candidates[position]);
			findCombinationSum(result, comb, position + 1, candidates, target - sum);
		}
		
		while (count != 0) {
			comb.remove(comb.size() - 1);
			count--;
		}
	}

}
