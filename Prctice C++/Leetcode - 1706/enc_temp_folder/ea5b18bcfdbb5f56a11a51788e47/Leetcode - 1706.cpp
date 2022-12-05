#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

vector<int> result;

void findBallDrop(int x, int y, vector<vector<int>>& grid) {
	if (grid[x][y] == -1 && y == 0) {
		result.push_back(-1);
		return;
	}
	
	if (grid[x][y] == 1 && y == grid[x].size() - 1) {
		result.push_back(-1);
		return;
	}

	if (grid[x][y] == 1 && y + 1 <= grid[0].size() - 1 && grid[x][y + 1] == -1) {
		result.push_back(-1);
		return;
	}

	if (grid[x][y] == -1 && y - 1 >= 0 && grid[x][y - 1] == 1) {
		result.push_back(-1);
		return;
	}

	if (x == grid.size() - 1 && y >= 0 && y < grid[0].size()) {
		result.push_back(y - 1);
		return;
	}

	if (grid[x][y] == 1) {
		findBallDrop(x + 1, y + 1, grid);
	}
	else {
		findBallDrop(x + 1, y - 1, grid);
	}
}

class Solution {
public:
	vector<int> findBall(vector<vector<int>>& grid) {
		result.clear();
		for (int i = 0; i < grid[0].size(); i++) {
			findBallDrop(0, i, grid);
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