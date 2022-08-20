package beecrowd;

public class SSequenceII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1;
		int i = 2;
		for(int j = 3; j <= 39; j = j + 2) {
			sum = sum + (double) j / i;
			i = i * 2;
		}
		System.out.printf("%.2f\n", sum);
	}

}
