package beecrowd;

public class SequenceIJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 7;
		while (i <= 9) {
			int count = 0;
			int temp = j;
			while (count < 3) {
				System.out.printf("I=%d J=%d\n", i, j - count);	
				count++;
			}
			i = i + 2;
			j = j + 2;
		}
	}

}
