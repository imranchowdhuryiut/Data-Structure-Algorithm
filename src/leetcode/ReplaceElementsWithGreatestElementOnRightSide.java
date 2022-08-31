package leetcode;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public int[] replaceElements(int[] arr) {
		if (arr.length == 1) {
			arr[0] = - 1;
			return arr;
		} else {
			int max = arr[arr.length - 1];
			for(int j = arr.length - 2; j >= 0; j--) {
				if (arr[j] > max) {
					int temp = max;
					max = arr[j];
					arr[j] = temp; 
				} else {
					arr[j] = max; 
				}
			}
			arr[arr.length - 1] = -1;
		}
		return arr;
	}

}
