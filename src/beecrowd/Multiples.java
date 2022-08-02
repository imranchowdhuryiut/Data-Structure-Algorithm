package beecrowd;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		if (a > b) {
			if (a % b == 0) {
				System.out.print("Sao Multiplos\n");
			} else {
				System.out.print("Nao sao Multiplos\n");
			}
		} else {
			if (b % a == 0) {
				System.out.print("Sao Multiplos\n");
			} else {
				System.out.print("Nao sao Multiplos\n");
			}
		}

	}

}
