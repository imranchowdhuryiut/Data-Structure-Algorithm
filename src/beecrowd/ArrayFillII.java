package beecrowd;

import java.util.Scanner;

public class ArrayFillII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[1000];
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			arr[i] = count;
			count++;
			if (count == n) {
				count = 0;
			}
			System.out.printf("N[%d] = %d\n", i, arr[i]);
		}
		
	}

}
