package beecrowd;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (num > 0) {
				if (num % 2 == 0) {
					System.out.print("EVEN POSITIVE\n");
				} else {
					System.out.print("ODD POSITIVE\n");
				}
			} else if (num < 0) {
				if (num % 2 == 0) {
					System.out.print("EVEN NEGATIVE\n");
				} else {
					System.out.print("ODD NEGATIVE\n");
				}
			} else {
				System.out.print("NULL\n");
			}
		}
	}

}
