package leetcode;

public class ShuffleString {

	public String restoreString(String s, int[] indices) {
		char[] chars = new char[indices.length];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < indices.length; i++) {
			chars[indices[i]] = s.charAt(i); 
		}
		sb.append(chars);
		return sb.toString();
	}

}
