package leetcode;

import javax.swing.plaf.basic.BasicArrowButton;

public class NumberOfStepsToReduceANumberToZero {

	public int numberOfSteps(int num) {
		int count = 0;
		char[] bitCount = Integer.toBinaryString(num).toCharArray();
		for(int i = 0; i < bitCount.length; i++) {
			if (bitCount[i] == '0') {
				count = count + 1;
			} else {
				count = count + 2;
			}
		}
		return count - 1;
	}

}
