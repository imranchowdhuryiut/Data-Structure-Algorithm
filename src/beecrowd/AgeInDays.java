package beecrowd;

import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int inputDays = in.nextInt();
        int year = inputDays / 365;
        System.out.printf("%d ano(s)\n", year);
        int month = (inputDays - (year * 365)) / 30;
        System.out.printf("%d mes(es)\n", month);
        int days = inputDays - ((year * 365) + (month * 30));
        System.out.printf("%d dia(s)\n", days);
    }

}
