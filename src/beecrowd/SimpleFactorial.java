package beecrowd;

import java.util.Scanner;

public class SimpleFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int answer = factorial(n);
		System.out.println(answer);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
