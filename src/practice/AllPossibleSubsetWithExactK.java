package practice;

import java.util.ArrayList;

public class AllPossibleSubsetWithExactK {

	ArrayList<Character> list = new ArrayList<>();

	public void printAllPossibleSubset(int position, int k, String s) {
		if (position == s.length() && k == 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			return;
		} 
		if (position == s.length()) {
			return;
		}
		
		printAllPossibleSubset(position+1, k, s);
		
		if (k > 0) {
			list.add(s.charAt(position));
			printAllPossibleSubset(position+1, k - 1, s);
			list.remove(list.size() - 1);
		}
	}
	
}
