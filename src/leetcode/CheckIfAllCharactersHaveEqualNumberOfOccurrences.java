package leetcode;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

	public boolean areOccurrencesEqual(String s) {
		int[] charCount = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int charToInt = s.charAt(i) - 97;
			charCount[charToInt]++;
		}
		
		boolean isFirst = false;
		int countToMatch = 0;
		
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] == 0) {
				continue;
			} else if (!isFirst) {
				countToMatch = charCount[i];
				isFirst = true;
			} else if (countToMatch == charCount[i]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}
