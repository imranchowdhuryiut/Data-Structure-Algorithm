package codechef;

import java.util.Scanner;

public class SpeedLimitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			double speed1 = (double)a/b;
			double speed2 = (double)c/d;
			if (speed1 > speed2) {
				System.out.println("Alice");
			} else if (speed1 < speed2) {
				System.out.println("Bob");
			} else {
				System.out.println("Equal");
			}
		}
	}

}
