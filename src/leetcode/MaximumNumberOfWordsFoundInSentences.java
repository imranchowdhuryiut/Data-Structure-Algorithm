package leetcode;

public class MaximumNumberOfWordsFoundInSentences {

	public int mostWordsFound(String[] sentences) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < sentences.length; i++) {
			int wordCount = sentences[i].split(" ").length;
			if (wordCount > max) {
				max = wordCount;
			}
		}
		return max;
	}

}
