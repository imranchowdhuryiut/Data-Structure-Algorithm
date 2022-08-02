package beecrowd;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		if (((a+b) > c) && ((a+c) > b) && (c+b) > a) {
			System.out.printf("Perimetro = %.1f\n", a + b + c);
		} else {
			System.out.printf("Area = %.1f\n", ((a+b) * c) / 2);
		}
	}

}
