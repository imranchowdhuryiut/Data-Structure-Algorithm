package leetcode;

public class DuplicateZeros {
	
	public void duplicateZeros(int[] arr) {
		int[] temp = new int[arr.length];
		int position = 0;
		for (int i = 0; position < arr.length; i++) {
			if (arr[i] == 0) {
				temp[position] = 0;
				if (position + 1 < arr.length) {
					temp[position + 1] = 0;
					position = position + 2;
				} else {
					break;
				}
			} else {
				temp[position] = arr[i];
				position++;
			}
		}
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
			arr[i] = temp[i];
		}
	}
	
}
