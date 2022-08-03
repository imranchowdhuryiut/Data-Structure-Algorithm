package beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		double array[] = new double[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		Arrays.sort(array);
		findTriangleType(array[2], array[1], array[0]);
	}

	private static void findTriangleType(double x, double y, double z) {
		// TODO Auto-generated method stub
		if (x >= (y + z)) {
			System.out.print("NAO FORMA TRIANGULO\n");
		} else {
			if (Math.pow(x, 2) == (Math.pow(y, 2) + Math.pow(z, 2))) {
				System.out.print("TRIANGULO RETANGULO\n");
			}
			if (Math.pow(x, 2) > (Math.pow(y, 2) + Math.pow(z, 2))) {
				System.out.print("TRIANGULO OBTUSANGULO\n");
			}
			if (Math.pow(x, 2) < (Math.pow(y, 2) + Math.pow(z, 2))) {
				System.out.print("TRIANGULO ACUTANGULO\n");
			}
			if (x == y && y == z) {
				System.out.print("TRIANGULO EQUILATERO\n");
			}
			if ((x==y && y !=z) || (y == z && z != x) || (x == z && z != y)) {
				System.out.print("TRIANGULO ISOSCELES\n");
			}
		}
		
	}

}
