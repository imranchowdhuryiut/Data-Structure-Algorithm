#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <limits>

using namespace std;

bool arr[50][50];
int maxSize = 0;
int m, n;
int area;

bool isValid(int x, int y) {
	if (x >= 0 && x <= m - 1 && y >= 0 && y <= n - 1  && arr[x][y] == false) {
		return true;
	}
	return false;
}

void doDFS(int x, int y, vector<vector<int>>& grid) {
	if (isValid(x, y) && grid[x][y] == 1) {
		area++;
		arr[x][y] = true;
		doDFS(x + 1, y, grid);
		doDFS(x, y + 1, grid);
		doDFS(x, y - 1, grid);
		doDFS(x - 1, y, grid);
	}
	else {
		return;
	}
}

class Solution {
public:
	int maxAreaOfIsland(vector<vector<int>>& grid) {
		memset(arr, false, sizeof(arr));
		maxSize = 0;
		m = grid.size();
		n = grid[0].size();
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid[i].size(); j++) {
				if (grid[i][j] == 1 && arr[i][j] == false) {
					area = 0;
					doDFS(i, j, grid);
					if (area > maxSize) {
						maxSize = area;
					}
				}
			}
		}
		return maxSize;
	}
};

int main()
{
	cout << "Hello World!\n"; 
	return 0;
}