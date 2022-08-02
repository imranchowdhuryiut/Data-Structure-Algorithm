package beecrowd;

import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a > b && c > b) {
			if (a > c) {
				System.out.printf("%d\n%d\n%d\n\n", b, c, a);
			} else {
				System.out.printf("%d\n%d\n%d\n\n", b, a, c);
			}
		} else if (b > c && a > c) {
			if (b > a) {
				System.out.printf("%d\n%d\n%d\n\n", c, a, b);
			} else {
				System.out.printf("%d\n%d\n%d\n\n", c, b, a);
			}
		} else {
			if (b > c) {
				System.out.printf("%d\n%d\n%d\n\n", a, c, b);
			} else {
				System.out.printf("%d\n%d\n%d\n\n", a, b, c);
			}
		}
		System.out.printf("%d\n%d\n%d\n", a, b, c);

	}

}
