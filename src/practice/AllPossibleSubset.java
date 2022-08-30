package practice;

import java.util.ArrayList;

public class AllPossibleSubset {
	
	ArrayList<Character> list = new ArrayList<>();

	public void printAllPossibleSubset(int position, String s) {
		if (position == s.length()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			return;
		} 
		printAllPossibleSubset(position+1, s);
		
		list.add(s.charAt(position));
		printAllPossibleSubset(position+1, s);
		list.remove(list.size() - 1);
		
	}
	
}
