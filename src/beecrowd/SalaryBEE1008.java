package beecrowd;

import java.util.Scanner;

public class SalaryBEE1008 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int hour = in.nextInt();
        double pay = in.nextDouble();
        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f", hour * pay);

    }

}
