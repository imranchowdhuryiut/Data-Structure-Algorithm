package beecrowd;

import java.util.Scanner;

public class LogicalSequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int count = 0;
		for (int i = 1; i <= y; i++) {
			count++;
			if (count < x) {
				System.out.printf("%d ", i);
			} else {
				System.out.printf("%d\n", i);
				count = 0;
			}
		}
	}

}
