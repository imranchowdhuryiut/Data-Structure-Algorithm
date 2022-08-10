package beecrowd;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			if (x == 0 || y == 0) {
				break;
			}
			
			if (x > 0 && y > 0) {
				System.out.print("primeiro\n");
			} else if (x > 0 && y < 0) {
				System.out.print("quarto\n");
			} else if (x < 0 && y < 0) {
				System.out.print("terceiro\n");
			} else {
				System.out.print("segundo\n");
			}
			
		}
	}

}
