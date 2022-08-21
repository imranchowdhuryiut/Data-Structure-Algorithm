package beecrowd;

import java.util.Scanner;

public class ArraySelectionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			double n = in.nextDouble();
			if (n <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, n);
			}
		}
	}

}
