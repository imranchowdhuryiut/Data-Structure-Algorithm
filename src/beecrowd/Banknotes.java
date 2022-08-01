package beecrowd;

import java.util.Scanner;

public class Banknotes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int note100 = amount / 100;
        System.out.printf("%d\n", amount);
        System.out.printf("%d nota(s) de R$ 100,00\n", note100);
        int note50 = (amount - (note100 * 100)) / 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", note50);
        int note20 = (amount - ((note100 * 100) + (note50 * 50))) / 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", note20);
        int note10 = (amount - ((note100 * 100) + (note50 * 50) + (note20 * 20))) / 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", note10);
        int note5 = (amount - ((note100 * 100) + (note50 * 50) + (note20 * 20) + (note10 * 10))) / 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", note5);
        int note2 = (amount - ((note100 * 100) + (note50 * 50) + (note20 * 20) + (note10 * 10) + (note5 * 5))) / 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", note2);
        int note1 = amount - ((note100 * 100) + (note50 * 50) + (note20 * 20) + (note10 * 10) + (note5 * 5) + (note2 * 2));
        System.out.printf("%d nota(s) de R$ 1,00\n", note1);
    }

}
