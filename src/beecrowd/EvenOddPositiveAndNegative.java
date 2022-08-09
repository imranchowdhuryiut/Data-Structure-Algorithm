package beecrowd;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int array[] = new int[5];
		int even = 0;
		int odd = 0;
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
			if (array[i] > 0) {
				pos++;
			} else if (array[i] < 0) {
				
			}{
				neg++;
			}
			
			if (array[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.printf("%d valor(es) par(es)\n", even);
		System.out.printf("%d valor(es) impar(es)\n", odd);
		System.out.printf("%d valor(es) positivo(s)\n", pos);
		System.out.printf("%d valor(es) negativo(s)\n", neg);
	}

}
