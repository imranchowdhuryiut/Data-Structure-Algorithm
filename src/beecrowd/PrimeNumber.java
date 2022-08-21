package beecrowd;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		int t = inScanner.nextInt();
		for(int i = 1; i <= t; i++) {
			int n = inScanner.nextInt();
			boolean isNotPrime = false;
			for(int j = 2; j <= n / 2; j++) {
				if (n % j == 0) {
					isNotPrime = true;
					System.out.printf("%d nao eh primo\n", n);
					break;
				}
			}
			if(!isNotPrime) {
				System.out.printf("%d eh primo\n", n);
			}
		}
		
	}

}
