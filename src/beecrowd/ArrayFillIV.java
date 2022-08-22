package beecrowd;

import java.util.Scanner;

public class ArrayFillIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] odd = new int[5];
		int[] even = new int[5];
		int count = 0;
		int oddCount = 0;
		int evenCount = 0;
		while (count != 15) {
			int n = in.nextInt();
			if (n % 2 == 0) {
				even[evenCount] = n;
				evenCount++;
				if (evenCount == 5) {
					for (int i = 0; i < even.length; i++) {
						System.out.printf("par[%d] = %d\n", i, even[i]);
						even[i] = Integer.MAX_VALUE;
						evenCount = 0;
					}
				}
			} else {
				odd[oddCount] = n;
				oddCount++;
				if (oddCount == 5) {
					for (int i = 0; i < odd.length; i++) {
						System.out.printf("impar[%d] = %d\n", i, odd[i]);
						odd[i] = Integer.MAX_VALUE;
						oddCount = 0;
					}
				}
			}
			count++;
		}
		
		for (int i = 0; i < odd.length; i++) {
			if (odd[i] != Integer.MAX_VALUE ) {
				System.out.printf("impar[%d] = %d\n", i, odd[i]);
			}
		}
		for (int i = 0; i < even.length; i++) {
			if (even[i] != Integer.MAX_VALUE ) {
				System.out.printf("par[%d] = %d\n", i, even[i]);
			}
		}
		
	}

}
