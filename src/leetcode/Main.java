package leetcode;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SortingTheSentence ss = new SortingTheSentence();
//		System.out.println(ss.sortSentence("is2 sentence4 This1 a3"));
		
//		CheckIfNumbersAreAscendingInASentence c1 = new CheckIfNumbersAreAscendingInASentence();
//		System.out.println(c1.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
	
//		CheckIfAllAsAppearsBeforeAllBs c1 = new CheckIfAllAsAppearsBeforeAllBs();
//		System.out.println(c1.checkString("abab"));
		
//		int[] nums = {1,0,1,1,0,1};
//		MaxConsecutiveOnes m1 = new MaxConsecutiveOnes();
//		System.out.println(m1.findMaxConsecutiveOnes(nums));
		
//		int[] nums = {12,345,2,6,7896};
//		FindNumbersWithEvenNumberOfDigits f1 = new FindNumbersWithEvenNumberOfDigits();
//		System.out.println(f1.findNumbers(nums));
		
//		int[] nums = {-7,-3,2,3,11};
//		SquaresOfASortedArray s1 = new SquaresOfASortedArray();
//		System.out.println(Arrays.toString(s1.sortedSquares(nums)));
		
//		int[] nums = {1,0,2,3,0,4,5,0};
//		DuplicateZeros d1 = new DuplicateZeros();
//		d1.duplicateZeros(nums);
		
//		int[] nums1 = {1,2,3,0,0,0};
//		int m = 3;
//		int[] nums2 = {2,5,6};
//		int n = 3;
//		MergeSortedArray m1 = new MergeSortedArray();
//		m1.merge(nums1, m, nums2, n);
		
//		int[] nums = {1, 1, 2};
//		RemoveDuplicatesFromSortedArray r1 = new RemoveDuplicatesFromSortedArray();
//		System.out.println(r1.removeDuplicates(nums));
		
//		int[] arr = {-2,0,10,-19,4,6,-8};
//		CheckIfNAndItsDoubleExist c1 = new CheckIfNAndItsDoubleExist();
//		System.out.println(c1.checkIfExist(arr));
		
//		int[] arr = {0};
//		MoveZeroes m1 = new MoveZeroes();
//		m1.moveZeroes(arr);
		
		
//		int[] arr = {3,1,2,4};
//		SortArrayByParity s1 = new SortArrayByParity();
//		System.out.println(Arrays.toString(s1.sortArrayByParity(arr)));

		
//		Combinations c1 = new Combinations();
//		List<List<Integer>> res = c1.combine(4, 2);
//		for (int i = 0; i < res.size(); i++) {
//			for (int j = 0; j < res.get(i).size(); j++) {
//				System.out.print(res.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}
		
//		int[] nums = {2,3,5};
//		CombinationSum c1 = new CombinationSum();
//		List<List<Integer>> res = c1.combinationSum(nums, 8);
//		for (int i = 0; i < res.size(); i++) {
//			for (int j = 0; j < res.get(i).size(); j++) {
//				System.out.print(res.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}
		


//		int[] arr = {0,3, 2, 1};
//		ValidMountainArray v1 = new ValidMountainArray();
//		System.out.println(v1.validMountainArray(arr));
		
//		int[] arr = {0,3, 2, 1};
//		ReplaceElementsWithGreatestElementOnRightSide r1 = new ReplaceElementsWithGreatestElementOnRightSide();
//		System.out.println(Arrays.toString(r1.replaceElements(arr)));

		int[] nums = {10,1,2,7,6,1,5};
		CombinationSumII c1 = new CombinationSumII();
		List<List<Integer>> res = c1.combinationSum2(nums, 8);
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
