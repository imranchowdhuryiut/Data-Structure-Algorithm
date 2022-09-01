package leetcode;

public class JewelsAndStones {

	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		int[] arr = new int[52];
		for (int i = 0; i < stones.length(); i++) {
			int position = stones.charAt(i);
			if(position >= 65 && position <= 90) {
				arr[position - 65]++;
			} else {
				arr[position - 71]++;
			}
		}
		for (int i = 0; i < jewels.length(); i++) {
			int position = jewels.charAt(i);
			if(position >= 65 && position <= 90) {
				count = count + arr[position - 65];
			} else {
				count = count + arr[position - 71];
			}
		}
		return count;
	}

}
