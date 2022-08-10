package beecrowd;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if (a <= 0 || b <= 0) {
				break;
			}
			
			if (a < b) {
				calculateSum(a, b);
			} else {
				calculateSum(b, a);
			}
			
		}
	}

	private static void calculateSum(int a, int b) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + i;
			System.out.printf("%d ", i);
		}
		System.out.printf("Sum=%d\n", sum);
	}

}
