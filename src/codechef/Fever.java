package codechef;

import java.util.Scanner;

public class Fever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 1; i <= t; i++) {
			int a = in.nextInt();
			if (a > 98) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
