package codechef;

import java.util.Scanner;

public class BrokenPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a < b) {
				System.out.println("REPAIR");
			} else if (a > b) {
				System.out.println("NEW PHONE");
			} else {
				System.out.println("ANY");
			}
			
		}
	}

}
