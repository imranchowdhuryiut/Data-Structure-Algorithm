package beecrowd;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputSec = in.nextInt();
        int hour = inputSec / 3600;
        int min = (inputSec - (hour * 3600)) / 60;
        int sec = inputSec - ((hour * 3600) + (min * 60));
        System.out.printf("%d:%d:%d\n", hour, min, sec);
    }

}
