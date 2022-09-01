package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findCombinationSum3(result, new ArrayList<Integer>(), k, n, 1);
		return result;
 	}

	private void findCombinationSum3(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int depth, 
			int n, 
			int position
	) {
		// TODO Auto-generated method stub
		if (depth == 0) {
			int sum = 0;
			for(int j = 0; j < comb.size(); j++) {
				sum = sum + comb.get(j);
			}
			if (n == sum) {
				result.add(new ArrayList<>(comb));
				return;
			}
			return;
		}
		for (int i = position; i <= 9; i++) {
			comb.add(i);
			findCombinationSum3(result, comb, depth - 1, n, i + 1);
			comb.remove(comb.size() - 1);
		}
	}

}
