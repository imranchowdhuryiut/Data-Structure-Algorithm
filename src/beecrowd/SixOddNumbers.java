package beecrowd;

import java.util.Scanner;

public class SixOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		while(count < 6) {
			if (num % 2 != 0) {
				count++;
				System.out.printf("%d\n", num);
			}
			num++;
		}
	}

}
