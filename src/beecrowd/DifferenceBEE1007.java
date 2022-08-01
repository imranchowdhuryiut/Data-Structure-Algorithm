package beecrowd;

import java.util.Scanner;

public class DifferenceBEE1007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int res = (a * b) - (c * d);
        System.out.printf("DIFERENCA = %d\n", res);
    }

}
