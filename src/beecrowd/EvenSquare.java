package beecrowd;

import java.util.Scanner;

public class EvenSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d^2 = %d\n", i, i * i);
			}
		}
	}

}
