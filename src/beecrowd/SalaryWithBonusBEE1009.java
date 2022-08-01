package beecrowd;

import java.util.Scanner;

public class SalaryWithBonusBEE1009 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        double salary = in.nextDouble();
        double totalSale = in.nextDouble();
        double bonus = (totalSale * 15) / 100;
        System.out.printf("TOTAL = R$ %.2f\n", salary + bonus);

    }

}
