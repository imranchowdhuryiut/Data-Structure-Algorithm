package leetcode;

public class QueriesOnNumberOfPointsInsideACircle {
	
	public int[] countPoints(int[][] points, int[][] queries) {
		int[] result = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int count = 0;
			for (int j = 0; j < points.length; j++) {
				int a = points[j][0] - queries[i][0];
				int b = points[j][1] - queries[i][1];
				if ((a * a + b * b) <= (queries[i][2] * queries[i][2])) {
					count++;
				}
			}
			result[i] = count; 
		}
		return result;
	}
}
