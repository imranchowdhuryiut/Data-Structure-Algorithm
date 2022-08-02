package beecrowd;

import java.util.Scanner;

public class CoordinatesOfAPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.print("Origem\n");
		} else if (x == 0.0 && y != 0.0) {
			System.out.print("Eixo Y\n");
		} else if (x != 0.0 && y == 0.0) {
			System.out.print("Eixo X\n");
		} else if (x > 0.0 && y > 0.0) {
			System.out.print("Q1\n");
		} else if (x > 0.0 && y < 0.0) {
			System.out.print("Q4\n");
		} else if (x < 0.0 && y > 0.0) {
			System.out.print("Q2\n");
		} else {
			System.out.print("Q3\n");
		}
	}

}
