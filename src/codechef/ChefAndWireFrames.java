package codechef;

import java.util.Scanner;

public class ChefAndWireFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			System.out.println((2 * a + 2 * b) * c);
		}
	}

}
