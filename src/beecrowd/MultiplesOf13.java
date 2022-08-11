package beecrowd;

import java.util.Scanner;

public class MultiplesOf13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a < b) {
			calculateSum(a, b);
		} else {
			calculateSum(b, a);
		}
	}

	private static void calculateSum(int a, int b) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 13 != 0) {
				sum = sum + i;
			}
		}
		System.out.printf("%d\n", sum);
	}

}
