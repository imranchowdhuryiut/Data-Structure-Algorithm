package beecrowd;

import java.util.Scanner;

public class SummingConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int n = 0;
		
		while(n == 0 || n < 0) {
			n = in.nextInt();
		}
		int sum = 0;
		for (int i = a; i < a + n; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
