package beecrowd;

import java.util.Scanner;

public class SquareMatrixI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			if (n == 1) {
				System.out.println("  " + 1);
			} else {
				for(int i = 0; i < n; i++) {
					System.out.print("  ");
					for(int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
							System.out.print("   " + 1);
						} else {
							if (n % 2 == 1) {
								System.out.print("   " + (n - j)/2);
							}
						}
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}

}
