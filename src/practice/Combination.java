package practice;

import java.util.ArrayList;

public class Combination {

	static ArrayList<Character> list =   new ArrayList<>();
	static String string = "abcde";
	static int n = string.length();
	static int k = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination(0, 0);
	}

	private static void combination(int depth, int startPosition) {
		if (depth == k) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			return;
		}
		for (int i = startPosition; i < n - (k - depth - 1); i++) {
			list.add(string.charAt(i));
			combination(depth + 1, i + 1);
			list.remove(list.size() - 1);
		}
	}

}
