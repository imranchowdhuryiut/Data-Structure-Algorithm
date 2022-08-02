package beecrowd;

import java.util.Scanner;

public class Average3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float n1 = in.nextFloat();
		float n2 = in.nextFloat();
		float n3 = in.nextFloat();
		float n4 = in.nextFloat();

		float avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

		if (avg >= 7.0) {
			System.out.printf("Media: %.1f\n", avg);
			System.out.print("Aluno aprovado.\n");
		} else if (avg < 5.0) {
			System.out.printf("Media: %.1f\n", avg);
			System.out.print("Aluno reprovado.\n");
		} else if (avg >= 5.0 && avg <= 6.9) {
			System.out.printf("Media: %.1f\n", avg);
			System.out.print("Aluno em exame.\n");
			float n5 = in.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", n5);
			float avg2 = (avg + n5) / 2;
			if (avg2 >= 5.0) {
				System.out.print("Aluno aprovado.\n");
			} else if (avg < 5.0) {
				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", avg2);
		}
	}

}
