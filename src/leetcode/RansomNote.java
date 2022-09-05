package leetcode;

public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] magChar = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			int charToInt = magazine.charAt(i) - 97;
			magChar[charToInt]++;
		}
		
		int[] noteChar = new int[26];
		for (int i = 0; i < ransomNote.length(); i++) {
			int charToInt = ransomNote.charAt(i) - 97;
			noteChar[charToInt]++;;
		}
		for(int i = 0; i < 26; i++) {
			if (!(noteChar[i] <= magChar[i]) ) {
				return false;
			}
		}
		return true;
	}

}
