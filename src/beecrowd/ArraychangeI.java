package beecrowd;

import java.util.Scanner;

public class ArraychangeI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[20];
		for(int i = 19; i >= 0; i--) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("N[%d] = %d\n", i, arr[i]);
		}
	}
	
}
