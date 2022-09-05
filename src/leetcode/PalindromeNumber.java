package leetcode;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		String numberToString = String.valueOf(x);
		for (int i = 0; i < numberToString.length() / 2; i++) {
			if (numberToString.charAt(i) != numberToString.charAt(numberToString.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
 	