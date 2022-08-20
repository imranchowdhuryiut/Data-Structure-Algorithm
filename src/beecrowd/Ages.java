package beecrowd;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		int sum = 0;
		int count = 0;
		while(!((n = in.nextInt()) < 0)) {
			sum = sum + n;
			count++;
		}
		System.out.printf("%.2f\n", (double)sum/count);
	}

}
