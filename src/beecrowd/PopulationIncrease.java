package beecrowd;

import java.util.Scanner;

public class PopulationIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i <= t; i++) {
			int pa = in.nextInt();
			int pb = in.nextInt();
			double ga = in.nextDouble();
			double gb = in.nextDouble();
			calculatePopulationIncrease(pa, pb, ga, gb);
		}
	}

	private static void calculatePopulationIncrease(int pa, int pb, double ga, double gb) {
		int count = 0;
		while (pa <= pb) {
			pa = (int) (pa + (double)(pa * ga) / 100);
			pb = (int) (pb + (double)(pb * gb) / 100);
			count++;
			if (count > 100) {
				System.out.println("Mais de 1 seculo.");
				break;
			}
		}
		
		if (count < 101) {
			System.out.printf("%d anos.\n", count);
		}
		
	}

}
