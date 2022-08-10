package beecrowd;

import java.util.Scanner;

public class Experiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int cat = 0, rat = 0, frog = 0;
		for (int i = 0; i < t; i++) {
			int count = in.nextInt();
			char animal = in.next().charAt(0);
			if (animal == 'C') {
				cat = cat + count;
			} else if (animal == 'R') {
				rat = rat + count;
			} else {
				frog = frog + count;
			}
		}
		System.out.printf("Total: %d cobaias\n", cat + rat + frog);
		System.out.printf("Total de coelhos: %d\n", cat);
		System.out.printf("Total de ratos: %d\n", rat);
		System.out.printf("Total de sapos: %d\n", frog);
		System.out.printf("Percentual de coelhos: %.2f %%\n", (double)((cat * 100) / (double)(cat + rat + frog)));
		System.out.printf("Percentual de ratos: %.2f %%\n", (double)((rat * 100) / (double)(cat + rat + frog)));
		System.out.printf("Percentual de sapos: %.2f %%\n", (double)((frog * 100) / (double)(cat + rat + frog)));
	}

}
