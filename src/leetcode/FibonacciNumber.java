package leetcode;

import java.util.Arrays;

public class FibonacciNumber {

	public int fib(int n) {
        if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int[] nums = new int[n + 1];
			nums[0] = 0;
			nums[1] = 1;
			for (int i = 2; i < nums.length; i++) {
				nums[i] = nums[i - 1] + nums[i - 2]; 
			}
			return nums[nums.length - 1];
		}
    }
	
	public int fib2(int n) {
		int[] arr = new int[31];
        Arrays.fill(arr, -1);
        return calculateFibWithDP(arr, n);
    }



	private int calculateFibWithDP(int[] arr, int position) {
		if (position == 0) {
			return 0;
		} else if (position == 1) {
			return 1;
		} else {
			if (arr[position] == -1) {
				arr[position] = calculateFibWithDP(arr, position - 1) + calculateFibWithDP(arr, position - 2);
			}
			return arr[position];
		}
	}

}
