package hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PikachuAndCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = {2, 3, 5};
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findCombinationSum(result, new ArrayList<Integer>(), 0, arr, n);
		System.out.println(result.size());
	}

	private static void findCombinationSum(
			List<List<Integer>> result, 
			ArrayList<Integer> comb, 
			int position, 
			int[] arr,
			int target
	) {
		// TODO Auto-generated method stub
		if (target == 0) {
			result.add(new ArrayList<>(comb));
			return;
		} 
		if (target < 0) {
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			comb.add(arr[i]);
			findCombinationSum(result, comb, i + 1, arr, target - arr[i]);
			comb.remove(comb.size() - 1);
		}
	}

}
