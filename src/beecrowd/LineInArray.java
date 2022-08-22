package beecrowd;

import java.util.Scanner;

public class LineInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int lineNumber = in.nextInt();
		char c = in.next().charAt(0);
		double sum = 0;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				double n = in.nextDouble();
				if (i == lineNumber) {
					sum = sum + n;
				}
			}
		}
		
		if (c == 'S') {
			System.out.printf("%.1f\n", sum);
		} else {
			System.out.printf("%.1f\n", sum / 12);
		}
		
	}

}
