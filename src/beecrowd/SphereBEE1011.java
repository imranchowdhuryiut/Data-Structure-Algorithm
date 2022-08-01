package beecrowd;

import java.util.Scanner;

public class SphereBEE1011 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        System.out.printf("VOLUME = %.3f\n", (r * r * r * 3.14159 * (4.0/3)));

    }

}
