package beecrowd;

import java.util.Scanner;

public class ArrayFillIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double[] arr = new double[100];
		arr[0] = in.nextDouble();
		System.out.printf("N[0] = %.4f\n", arr[0]);
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] / 2;
			System.out.printf("N[%d] = %.4f\n", i, arr[i]);
		}
		
	}

}
