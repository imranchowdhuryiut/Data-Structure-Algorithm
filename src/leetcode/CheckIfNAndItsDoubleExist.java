package leetcode;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
	
	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[j] == 2 * arr[i]) {
					return true;
				}
			}
		}
		return false;
	}
}
