package beecrowd;

import java.util.Scanner;

public class Snack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code = in.nextInt();
        int unit = in.nextInt();
        double totalPrice = 0.00;
        switch (code) {
            case 1: {
                totalPrice = 4.00 * unit;
                break;
            }
            case 2: {
                totalPrice = 4.50 * unit;
                break;
            }
            case 3: {
                totalPrice = 5.00 * unit;
                break;
            }
            case 4: {
                totalPrice = 2.00 * unit;
                break;
            }
            case 5: {
                totalPrice = 1.50 * unit;
                break;
            }
        }
        System.out.printf("Total: R$ %.2f\n", totalPrice);
    }

}
