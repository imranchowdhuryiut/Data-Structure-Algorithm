package beecrowd;

import java.util.Scanner;

public class SimpleCalculateBEE1010 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int code1 = in.nextInt();
        int unit1 = in.nextInt();
        double price1 = in.nextDouble();

        int code2 = in.nextInt();
        int unit2 = in.nextInt();
        double price2 = in.nextDouble();


        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ((unit1 * price1) + (unit2 * price2)));
    }

}
