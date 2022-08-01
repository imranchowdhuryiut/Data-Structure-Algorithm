package beecrowd;

import java.util.Scanner;

public class TheGreatestBEE1013 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int g1 = (a + b + Math.abs(a - b)) / 2;
        int g2 = (b + c + Math.abs(b - c)) / 2;
        if (g1 > g2) {
            System.out.printf("%d eh o maior\n", g1);
        } else {
            System.out.printf("%d eh o maior\n", g2);
        }
    }

}
