package beecrowd;

import java.util.Scanner;

public class BhaskarasFormula {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double v = (b * b) - (4 * a * c);
        if (a == 0.00 || v < 0.00) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = ((b * -1) + Math.sqrt(v)) / (2 * a);
            double r2 = ((b * -1) - Math.sqrt(v)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }

}
