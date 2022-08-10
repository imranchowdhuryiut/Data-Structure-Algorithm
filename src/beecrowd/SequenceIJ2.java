package beecrowd;

public class SequenceIJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 10) {
			int j = 7;
			while (j > 4) {
				System.out.printf("I=%d J=%d\n", i, j);
				j--;
			}
			i = i + 2;
		}
	}

}
