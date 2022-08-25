package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] arr = new int[m + n];
		int pos = nums1.length - 1;
		m = m - 1;
		n = n - 1;
		while (m != -1 || n != -1) {
			if (m == -1) {
				for (int i = n; i >= 0; i--) {
					arr[pos] = nums2[i];
					pos--;
				}
				break;
			}
			if (n == -1) {
				for (int i = m; i >= 0; i--) {
					arr[pos] = nums1[i];
					pos--;
				}
				break;
			}
			int a = nums1[m];
			int b = nums2[n];
			if (a > b) {
				arr[pos] = a;
				m--;
			} else {
				arr[pos] = b;
				n--;
			}
			pos--;
		}
		for (int i = 0; i < arr.length; i++) {
			nums1[i] = arr[i]; 
		}
	}

}
