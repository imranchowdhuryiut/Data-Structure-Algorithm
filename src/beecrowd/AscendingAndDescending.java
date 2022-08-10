package beecrowd;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if (a == b) {
				break;
			}
			
			if (a < b) {
				System.out.print("Crescente\n");
			} else {
				System.out.print("Decrescente\n");
			}
		}
	}

}
