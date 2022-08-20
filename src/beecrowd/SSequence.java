package beecrowd;

public class SSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + (double) 1 / i; 
		}
		System.out.printf("%.2f\n", sum);
	}

}
