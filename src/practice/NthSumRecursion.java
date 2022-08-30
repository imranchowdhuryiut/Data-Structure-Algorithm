package practice;

public class NthSumRecursion {

	public int getSum(int i, int n) {
		if (i > n) {
			return 0;
		}
		return i + getSum(i + 1, n);
	}
	
}
