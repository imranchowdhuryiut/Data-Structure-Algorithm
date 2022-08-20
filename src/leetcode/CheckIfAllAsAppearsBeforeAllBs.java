package leetcode;

public class CheckIfAllAsAppearsBeforeAllBs {
	
	public boolean checkString(String s) {
		boolean isFirstBFound = false;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'b') {
				isFirstBFound = true;
			}
			if (isFirstBFound && s.charAt(i) == 'a') {
				return false;
			}
		}
		return true;
	}
}
