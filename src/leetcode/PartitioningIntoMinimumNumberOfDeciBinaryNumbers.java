package leetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

	public int minPartitions(String n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n.length(); i++) {
			int value = Integer.valueOf(String.valueOf(n.charAt(i)));
			if (value > max) {
				max = value;
			}
		}
		return max;
	}
	
	public int minPartitions2(String n) {
		int max = 0;
		for (int i = 0; i < n.length(); i++) {
			max = Math.max(max, n.charAt(i) - '0');
		}
		return max;
	}

}
