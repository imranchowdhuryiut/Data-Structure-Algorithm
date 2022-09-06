package leetcode;

public class NumberOfLaserBeamsInABank {

	public int numberOfBeams(String[] bank) {
		int count = 0;
		boolean isFirst = true;
		int previousCount = 0;
		for (int i = 0; i < bank.length; i++) {
			int laserCount = bank[i].replace("0", "").length();
			if (laserCount == 0) {
				continue;
			} else {
				if (isFirst) {
					previousCount = laserCount;
					isFirst = false;
					continue;
				} else {
					int beamCount = laserCount * previousCount;
					count += beamCount;
					previousCount = laserCount;
				}
			}
		}
		return count;
	}

}
