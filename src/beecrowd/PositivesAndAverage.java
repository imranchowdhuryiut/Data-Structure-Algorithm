package beecrowd;

import java.util.Scanner;

public class PositivesAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double array[] = new double[6];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = in.nextDouble(); 
		}
		int count = 0;
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
				sum = sum + array[i];
			}
		}
		
		System.out.printf("%d valores positivos\n", count);
		System.out.printf("%.1f\n", sum / count);
	}

}
