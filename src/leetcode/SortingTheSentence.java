package leetcode;

public class SortingTheSentence {

	public String sortSentence(String s) {
		StringBuilder sb = new StringBuilder();
		String[] array = s.split(" ");
		String[] out = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			int position = Integer.parseInt(String.valueOf(array[i].charAt(array[i].length() - 1))) - 1;
			String word = array[i].substring(0, array[i].length() - 1);
			out[position] = word;
		}
		for (int i = 0; i < out.length; i++) {
			sb.append(out[i]);
			if (i < out.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
