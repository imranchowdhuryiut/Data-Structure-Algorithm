package beecrowd;

import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			int count = 5;
			int sum = 0;
			for (int i = n; count >= 1; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
					count--;
				}
			}
			System.out.println(sum);
		}
	}

}
