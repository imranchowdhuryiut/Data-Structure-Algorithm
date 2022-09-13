package leetcode;

public class StrictlyPalindromicNumber {

	public boolean isStrictlyPalindromic(int n) {
		for (int i = 2; i <= n - 2; i++) {
			String numInBase = numberToBase(n, i);
			if (!isPalindrome(numInBase)) {
				return false;
			}
		}
		return true;
	}

	private boolean isPalindrome(String numInBase) {
		for (int i = 0; i < numInBase.length() / 2; i++) {
			if (numInBase.charAt(i) != numInBase.charAt( numInBase.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private String numberToBase(int n, int i) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % i);
			n = n / i;
		}
		return sb.reverse().toString();
	}

}
