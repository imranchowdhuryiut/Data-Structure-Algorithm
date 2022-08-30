package practice;

public class Recursion1 {

	public int recursion(int n) {
		// TODO Auto-generated method stub
		if (n < 1) {
			return 0;
		}
		System.out.println(n);
		return recursion(n - 1);
	}
	
	public int recursion2(int n, int limit) {
		if (n > limit) {
			return 0;
		}
		System.out.println(n);
		return recursion2(n+1, limit);
	}
	
	public void recursion3(int n) {
		if (n < 1) {
			return;
		}
		recursion3(n - 1);
		System.out.println(n);
	}

}
