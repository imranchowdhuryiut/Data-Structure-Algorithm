package beecrowd;

import java.util.Scanner;

public class RestOfADivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		if (a < b) {
			printDigits(a, b);
		} else {
			printDigits(b, a);
		}
	}

	private static void printDigits(int a, int b) {
		// TODO Auto-generated method stub
		for (int i = a + 1; i < b; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.printf("%d\n", i);
			}
		}
	}

}
