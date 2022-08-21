package beecrowd;

import java.util.Scanner;

public class ArrayfillI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int n = in.nextInt();
		arr[0] = n;
		int temp = n;
		System.out.printf("N[0] = %d\n", arr[0]);
		for(int i = 1; i < 10; i++) {
			arr[i] = temp * 2;
			temp = arr[i];
			System.out.printf("N[%d] = %d\n", i, arr[i]);
		}
	}

}
