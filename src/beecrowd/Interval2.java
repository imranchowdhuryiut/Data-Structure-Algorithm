package beecrowd;

import java.util.Scanner;

public class Interval2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 1; i <= n; i++) {
			int temp = inp.nextInt();
			if (temp >= 10 && temp <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
	}

}
