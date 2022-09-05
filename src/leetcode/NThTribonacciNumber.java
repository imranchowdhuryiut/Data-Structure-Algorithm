package leetcode;

import java.util.Arrays;

public class NThTribonacciNumber {

	public int tribonacci(int n) {
		int[] arr = new int[37];
        Arrays.fill(arr, -1);
        return calculatetribonacciWithDP(arr, n);
	}

	private int calculatetribonacciWithDP(int[] arr, int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			if (arr[n] == -1 ) {
				arr[n] = calculatetribonacciWithDP(arr, n - 1) + calculatetribonacciWithDP(arr, n - 2) + calculatetribonacciWithDP(arr, n - 3);
			}
			return arr[n];
		}
	}

}
