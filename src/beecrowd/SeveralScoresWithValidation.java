package beecrowd;

import java.util.Scanner;

public class SeveralScoresWithValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		double sum = 0;
		boolean isFirst = true;
		boolean isInput = false;
		while (true) {
			double score = in.nextDouble();
			if (isInput && score == 2) {
				break;
			}
			if (isInput && score != 1) {
				System.out.print("novo calculo (1-sim 2-nao)\n");
			} else {
				if (isInput && score == 1) {
					isInput = false;
					continue;
				}
				if (score >= 0 && score <= 10) {
					count++;
					sum = sum + score;
					if (count == 2) {
						isFirst = false;
						System.out.printf("media = %.2f\n", sum / 2);
						System.out.print("novo calculo (1-sim 2-nao)\n");
						count = 0;
						sum = 0;
						isInput = true;
					}
				} else {
					System.out.print("nota invalida\n");
				}
			}
		
		}
	}

}
