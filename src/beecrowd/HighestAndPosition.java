package beecrowd;

import java.util.Scanner;

import javax.swing.text.Position;

public class HighestAndPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int max = -1;
		int pod = -1;
		for (int i = 0; i < 100; i++) {
			int temp = in.nextInt();
			if (temp > max) {
				max = temp;
				pod = i + 1;
			}
		}
		System.out.printf("%d\n%d\n", max, pod);
	}

}
