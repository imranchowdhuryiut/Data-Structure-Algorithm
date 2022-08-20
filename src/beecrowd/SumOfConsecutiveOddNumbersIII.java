package beecrowd;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 1; i <= t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			printSumOfConsecutiveOddNumbers(a, b);
		}
	}

	private static void printSumOfConsecutiveOddNumbers(int x, int y) {
		int count = 0;
		for(int i = x; y >= 1; i++) {
			if (i % 2 != 0) {
				count = count + i;
				y--;
			}
		}
		System.out.println(count);
	}

}
