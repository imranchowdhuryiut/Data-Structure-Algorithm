package beecrowd;

import java.util.Scanner;

public class FibonacciArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 1; i <= t; i++) {
			int n = in.nextInt();
			findNthFibonacciNumber(n);
		}
	}

	private static void findNthFibonacciNumber(int n) {
		if (n == 0) {
			System.out.println("Fib(0) = 0");
		} else if (n == 1) {
			System.out.println("Fib(1) = 1");
		} else {
			long[] arr = new long[n+1];
			arr[0] = 0;
			arr[1] = 1;
			for(int i = 2; i < n + 1; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
			System.out.printf("Fib(%d) = %d\n", n, arr[n]);
		}
		
		
	}

}
