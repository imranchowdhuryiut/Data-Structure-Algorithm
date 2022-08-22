package beecrowd;

import java.util.Scanner;

public class AboveTheMainDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		double sum = 0;
		int count = 0;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				double n = in.nextDouble();
				if (j > i) {
					sum = sum + n;
					count++;
				}
			}
		}
		
		if (c == 'S') {
			System.out.printf("%.1f\n", sum);
		} else {
			System.out.printf("%.1f\n", (double)sum / count);
		}
	}

}
