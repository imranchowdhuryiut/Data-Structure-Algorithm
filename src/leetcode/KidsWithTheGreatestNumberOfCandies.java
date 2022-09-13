package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> result = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i]> max ) {
				max = candies[i];
			}
		}
		
		for (int i = 0; i < candies.length; i++) {
			int sum = candies[i] + extraCandies;
			if (sum < max) {
				result.add(false);
			} else {
				result.add(true);
			}
		}
		
		return result;
	}

}
