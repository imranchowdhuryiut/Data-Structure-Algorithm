package leetcode;

public class NRepeatedElementInSize2NArray {

	public int repeatedNTimes(int[] nums) {
		int[] count = new int[10001];
		for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;
		}
		
		int n = nums.length / 2;
		int repetedNum = 0;
		for (int i = 0; i < count.length; i++) {
			if(count[i] == n) {
				return i;
			}
		}
		return repetedNum;
	}
	
	public int repeatedNTimes2(int[] A) {
		int[] count = new int[10000];
        for (int a : A)
            if (count[a]++ == 1)
                return a;
        return -1;
	}

}
