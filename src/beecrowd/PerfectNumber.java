package beecrowd;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 1; i <= t; i++) {
			int n = in.nextInt();
			int sum = 0;
			for(int j = 1; j <= n / 2; j++) {
				if (n % j == 0) {
					sum = sum + j;
				}
			}
			
			if (sum == n) {
				System.out.printf("%d eh perfeito\n", n);
			} else {
				System.out.printf("%d nao eh perfeito\n", n);
			}
		}
	}

}
