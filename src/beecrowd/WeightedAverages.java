package beecrowd;

import java.util.Scanner;

public class WeightedAverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		double sum = 0.0;
		for (int i = 0; i < t; i++) {
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			double avg = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f\n", avg);
		}
	}

}
