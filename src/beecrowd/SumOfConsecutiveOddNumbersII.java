package beecrowd;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a > b) {
				calculateSum(b, a);
			} else if (a <= b) {
				calculateSum(a, b);
			}
		}
	}

	private static void calculateSum(int a, int b) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = a + 1; i < b; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.printf("%d\n", sum);
	}

}
