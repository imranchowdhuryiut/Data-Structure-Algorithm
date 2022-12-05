package leetcode;

public class FindNearestPointThatHasTheSameXOrYCoordinate {

	public int nearestValidPoint(int x, int y, int[][] points) {
		int result = -1;
		int minDistance = Integer.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			if (x == points[i][0] || y == points[i][1]) {
				int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
				if (distance < minDistance) {
					minDistance = distance;
					result = i;
				}
				if (distance == minDistance) {
					if (i < result) {
						result = i;
					}
				}
			}
		}
		return result;
	}

}
