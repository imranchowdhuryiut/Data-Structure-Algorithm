package beecrowd;

import java.util.Scanner;

public class LogicalSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n", i, i * i, i * i *i);
			System.out.printf("%d %d %d\n", i, (i * i) + 1, (i * i *i) + 1);
		}
	}

}
