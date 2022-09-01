package leetcode;

public class NumberOfGoodPairs {

	public int numIdenticalPairs(int[] nums) {
		int[] arr = new int[100];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i] - 1]++;
		}
		
		int pairCount = 0;
		for(int i = 0; i < 100; i ++) {
			if (arr[i] <= 1) {
				continue;
			} else {
				int count = arr[i];
				pairCount = pairCount + getPairCount(count);
			}
		}
		return pairCount;
	}

	private int getPairCount(int count) {
		// TODO Auto-generated method stub
		if (count == 2) {
			return 1;
		}
		return getPairCount(count - 1) + (count - 1);
	}

}
