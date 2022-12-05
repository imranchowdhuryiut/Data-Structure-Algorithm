package practice;

import java.util.ArrayList;

public class Permutation {
	
	static String string = "123";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation(0, new ArrayList<Integer>(), 3);
	}

	private static void permutation(int depth, ArrayList<Integer> queue, int k) {
		if (depth == k) {
			for (int i = 0; i < queue.size(); i++) {
				System.out.print(string.charAt(queue.get(i)) + " ");
			}
			System.out.println();
			return;
		}
		ArrayList<Character> prevList = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			if (prevList.contains(string.charAt(i))) {
				continue;
			} 
			if (queue.contains(i)) {
				continue;
			}
			prevList.add(string.charAt(i));
			queue.add(i);
			permutation(depth + 1, queue, k);
			queue.remove(queue.size() - 1);
		}
	}

}
