package beecrowd;

import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int i = 1; i <= 4 * count; i++) {
			if (i % 4 == 0) {
				System.out.print("PUM\n");
			} else {
				System.out.printf("%d ", i);
			}
		}
	}

}
