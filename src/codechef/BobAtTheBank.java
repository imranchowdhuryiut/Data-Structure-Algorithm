package codechef;

import java.util.Scanner;

public class BobAtTheBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int result = ((b * d) - (c * d)) + a;
			System.out.println(result);
		}
	}

}
