package beecrowd;

import java.util.Scanner;

public class SquaredAndCubic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int i = 1; i <= count; i++) {
			System.out.printf("%d %d %d\n", i, i*i, i*i*i);
		}
	}

}
