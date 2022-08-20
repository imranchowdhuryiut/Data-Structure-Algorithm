package beecrowd;

import java.util.Scanner;

public class EasyFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printFibonacci(n);

	}

	private static void printFibonacci(int n) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		if (n == 1) {
			System.out.println(first);
		} else if (n == 2) {
			System.out.println(first + " " + second);
		} else if (n > 2){
			System.out.print(first + " " + second);
			n = n - 1;
			while (n != 1) {
				System.out.print(" ");
				int sum = first + second;
				first = second;
				second = sum;
				n = n - 1;
				System.out.print(sum);
			}
			System.out.println();
		} 
	}

}
