package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class DecodeTheMessage {
	
	public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
		ArrayList<Character> visited = new ArrayList<>();
		int index = 0;
		for (int i = 0; i < key.length(); i++) {
			char charecter = key.charAt(i);
			if (charecter != ' ') {
				if (!visited.contains(charecter)) {
					visited.add(charecter);
					map.put(charecter, Character.valueOf((char) (index + 97)));
					index++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ' ') {
				sb.append(' ');
			} else {
				sb.append(map.get(message.charAt(i)));
			}
		}
		return sb.toString();
    }
	
}
