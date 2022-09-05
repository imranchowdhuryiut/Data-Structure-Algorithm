package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public List<String> letterCasePermutation(String s) {
		List<String> result = new ArrayList<>();
		findLetterCasePermutation(result, 0, s.toLowerCase().toCharArray());
		return result;
	}

	private void findLetterCasePermutation(
			List<String> result, 
			int position, 
			char[] charArray
	) {
		// TODO Auto-generated method stub
		if (position == charArray.length) {
			StringBuilder sb = new StringBuilder();
			sb.append(charArray);
			result.add(sb.toString());
			return;
		}
		
		int charToInt = charArray[position];
		if (charToInt >= 97 && charToInt <= 122 || charToInt >= 65 && charToInt <= 90) {
			charArray[position] = Character.toLowerCase((char)charToInt);
			findLetterCasePermutation(result, position + 1, charArray);
			charArray[position] = Character.toUpperCase((char)charToInt);;
			findLetterCasePermutation(result, position + 1, charArray);
		} else {
			findLetterCasePermutation(result, position + 1, charArray);
		}
	}

}
