package beecrowd;

import java.util.Scanner;

public class EvenBetweenFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int array[] = new int[5];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		System.out.printf("%d valores pares\n", count);
	}

}
