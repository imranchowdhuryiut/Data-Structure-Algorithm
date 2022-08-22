package beecrowd;

import java.util.Scanner;

public class LowestNumberAndPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int position = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt(); 
			if (arr[i] < min  ) {
				min = arr[i];
				position = i;
			}
		}
		System.out.printf("Menor valor: %d\nPosicao: %d\n", min, position);
	}	

}
