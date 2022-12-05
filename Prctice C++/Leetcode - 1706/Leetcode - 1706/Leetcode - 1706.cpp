#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

vector<int> result;

void findBallDrop(int i, int j, vector<vector<int>>& grid, int n, int m) {
	if (i >= n) {
		result.push_back(j);
		return;
	}
		
	if (grid[i][j] == 1) {
		if (j == m - 1 || grid[i][j + 1] == -1) {
			result.push_back(-1);
			return;
		}

		if (grid[i][j + 1] == 1) {
			findBallDrop(i + 1, j + 1, grid, n, m);
			return;
		}
	}

	if (grid[i][j] == -1) {
		if (j == 0 || grid[i][j - 1] == 1) {
			result.push_back(-1);
			return;
		}
			
		if (grid[i][j - 1] == -1) {
			findBallDrop(i + 1, j - 1, grid, n, m);
			return;
		}
			
	}

	result.push_back(-1);
	return;
}

class Solution {
public:
	vector<int> findBall(vector<vector<int>>& grid) {
		result.clear();
		int row = grid.size();
		int col = grid[0].size();
		for (int i = 0; i < col; i++) {
			findBallDrop(0, i, grid, row, col);
		}
		return result;
	}
};

int main()
{
	Solution myObj;
	vector<vector<int>> grid = {{-1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, 1, -1, 1, -1, -1, 1, 1, -1, 1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, -1, 1, 1, 1, -1, -1, -1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, -1, 1, 1, 1, -1, -1, -1, -1} };
	myObj.findBall(grid);
	cout << "Hello World!\n";
}