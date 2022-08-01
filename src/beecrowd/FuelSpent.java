package beecrowd;

import java.util.Scanner;

public class FuelSpent {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int speed = in.nextInt();

        double fuelSpent = (time * speed) / 12.0;

        System.out.printf("%.3f\n", fuelSpent);


    }

}
