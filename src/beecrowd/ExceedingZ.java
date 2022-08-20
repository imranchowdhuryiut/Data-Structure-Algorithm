package beecrowd;

import java.util.Scanner;

public class ExceedingZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		while (y <= x) {
			y = in.nextInt();
		}
		int count = 0;
		int sum = 0;
		for (int i = x; ; i++) {
			count++;
			sum = sum + i;
			if (sum > y) {
				System.out.println(count);
				break;
			}
		}
	}

}
