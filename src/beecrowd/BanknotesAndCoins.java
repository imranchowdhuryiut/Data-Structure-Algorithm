package beecrowd;

import java.util.Scanner;

public class BanknotesAndCoins {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int taka = (int) amount;
        int paisa = (int)((amount - taka) * 100);
        System.out.print("NOTAS:\n");
        int note100 = taka / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", note100);
        int note50 = (taka - (note100 * 100)) / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", note50);
        int note20 = (taka - ((note100 * 100) + (note50 * 50))) / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", note20);
        int note10 = (taka - ((note100 * 100) + (note50 * 50) + (note20 * 20))) / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", note10);
        int note5 = (taka - ((note100 * 100) + (note50 * 50) + (note20 * 20) + (note10 * 10))) / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", note5);
        int note2 = (taka - ((note100 * 100) + (note50 * 50) + (note20 * 20) + (note10 * 10) + (note5 * 5))) / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", note2);
        System.out.print("MOEDAS:\n");
        int note1 = taka - ((note100 * 100) + (note50 * 50) + (note20 * 20) + (note10 * 10) + (note5 * 5) + (note2 * 2));
        System.out.printf("%d moeda(s) de R$ 1.00\n", note1);
        int coin50 = (paisa) / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", coin50);
        int coin25 = (paisa - (coin50 * 50)) / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", coin25);
        int coin10 = (paisa - ((coin50 * 50) + (coin25 * 25))) / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", coin10);
        int coin5 = (paisa - ((coin50 * 50) + (coin25 * 25) + (coin10 * 10))) / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", coin5);
        int coin1 = (paisa - ((coin50 * 50) + (coin25 * 25) + (coin10 * 10) + (coin5 * 5)));
        System.out.printf("%d moeda(s) de R$ 0.01\n", coin1);
    }

}
