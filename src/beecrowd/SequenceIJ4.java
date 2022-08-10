package beecrowd;

import java.text.DecimalFormat;

public class SequenceIJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 0;
		double j = 1;
		while (i <= 2.00) {
			int count = 0;
			while (count < 3) {
				double temp = i - (int) i;
				if (temp == 0) {
					System.out.printf("I=%.0f J=%.0f\n", i, j + count);
				} else {
					System.out.printf("I=%.1f J=%.1f\n", i, j + count);
				}
				count++;
			}
			i = Double.valueOf(new DecimalFormat("#.#").format(i + 0.2));
			j = Double.valueOf(new DecimalFormat("#.#").format(j + 0.2));
		}
	}

}
