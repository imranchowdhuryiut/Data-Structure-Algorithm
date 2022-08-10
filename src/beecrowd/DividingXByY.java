package beecrowd;

import java.util.Scanner;

public class DividingXByY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (b == 0) {
				System.out.print("divisao impossivel\n");
			} else {
				System.out.printf("%.1f\n", a/(double)b);
			}
		}
	}

}
