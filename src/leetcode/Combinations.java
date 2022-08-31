package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		calculateCombination(result, new ArrayList<Integer>(), 0, 0, k, n);

		return result;
	}

	private void calculateCombination(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int depth, 
			int startPosition,
			int k, int n
	) {
		// TODO Auto-generated method stub
		if (depth == k) {
			result.add(new ArrayList<>(comb));
			return;
		}
		for (int i = startPosition; i < n - (k - depth - 1); i++) {
			comb.add(i + 1);
			calculateCombination(result, comb, depth + 1, i + 1, k, n);
			comb.remove(comb.size() - 1);
		}

	}

}
