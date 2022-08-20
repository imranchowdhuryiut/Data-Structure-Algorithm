package leetcode;

public class CheckIfNumbersAreAscendingInASentence {
	
	public boolean areNumbersAscending(String s) {
		String[] array = s.split(" ");
		int diff = -1;
		int prevNum = -1;
		for (int i = 0; i < array.length; i++) {
			try {
				int num = Integer.parseInt(array[i]);
				if (prevNum == -1) {
					prevNum = num;
				} else {
					diff = num - prevNum;
					if (diff <= 0) {
						return false;
					} else {
						prevNum = num;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				continue;
			}
		}
		return true;
	}
}
