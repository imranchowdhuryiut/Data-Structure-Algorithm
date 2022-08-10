package beecrowd;

import java.util.Scanner;

public class Remaining2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= 10000; i++) {
			if (i % n == 2) {
				System.out.printf("%d\n", i);
			}
		}
	}

}
