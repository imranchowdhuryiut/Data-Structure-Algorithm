package practice;

public class CombinationUsingBit {
	
	static String string = "abcde";
	static int n = string.length();
	static int k = 3;
	
	public static void main(String[] args) {
		combinationUsingBitMask(0, 0, 0);
	}
	

	private static void combinationUsingBitMask(int depth, int mask, int startPosition) {
		if (depth == k) {
			for (int i = 0; i < 31; i++) {
				if (checkBit(mask, i)) {
					System.out.print(string.charAt(i));
				}
			}
			System.out.println();
			return;
		}
		for (int i = startPosition; i < n - (k - depth - 1); i++) {
			mask = setBitOn(mask, i);
			combinationUsingBitMask(depth + 1, mask, i + 1);
			mask = setBitOff(mask, i);
		}		
	}

	private static int setBitOn(int mask, int position) {
		int temp = (int) Math.pow(2, position);
		return mask | temp;
	}
	
	private static int setAllBitOnExceptPosition(int position) {
		int mask = 0;
		for (int i = 0; i < 31; i++) {
			if (i == position) {
				continue;
			}
			mask = setBitOn(mask, i);
		}
		return mask;
	}
	
	private static int setBitOff(int mask, int position) {
		return mask & setAllBitOnExceptPosition(position);
	}
	
	private static int countBit(int mask) {
		int count = 0;
		for (int i = 0; i < 31; i++) {
			int temp = (int) Math.pow(2, i);
			if ((mask & temp) != 0) {
				count++;
			}
		}
		return count;
	}
	
	private static boolean checkBit(int mask, int position) {
		int temp = (int) Math.pow(2, position);
		if ((mask & temp) != 0) {
			return true;
		}
		return false;
	}
	
}
