package beecrowd;

import java.util.Scanner;

public class ScoreValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0; 
		double sum = 0;
		while (true) {
			double score = in.nextDouble();
			if (score >= 0 && score <= 10) {
				count++;
				sum = sum + score;
			} else {
				System.out.print("nota invalida\n");
			}
			if (count == 2) {
				break;
			}
		}
		System.out.printf("media = %.2f\n", sum / 2);
	}

}
