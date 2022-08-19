package beecrowd;

import java.util.Scanner;

public class GrowingSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			} else {
				for(int i = 1; i <= n; i++) {
					if (i == n) {
						System.out.println(i);
					} else {
						System.out.print(i + " ");
					}
				}
			}
			
		}
	}

}
