package leetcode;

public class WateringPlants {

	public int wateringPlants(int[] plants, int capacity) {
		int stepCount = 0;
		int waterinCan = capacity;
		for (int i = 0; i < plants.length; i++) {
			if (waterinCan >= plants[i]) {
				stepCount += 1;
				waterinCan -= plants[i];
			} else {
				stepCount += i + i + 1;
				waterinCan = capacity - plants[i];
			}
		}
		return stepCount;
	}

}
