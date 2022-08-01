package beecrowd;

import java.util.Scanner;

public class ConsumptionBEE1014 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();
        double fuel = in.nextDouble();
        System.out.printf("%.3f km/l\n", distance / fuel);

    }

}
