#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

bool arr[300][300];
int row, col;

bool isValid(int x, int y) {
	if (x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1 && arr[x][y] == false) {
		return true;
	}
	return false;
}

void doDFS(int x, int y, vector<vector<char>>& grid) {
	if (isValid(x, y) && grid[x][y] == '1') {
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
	int numIslands(vector<vector<char>>& grid) {
		int count = 0;
		memset(arr, false, sizeof(arr));
		row = grid.size();
		col = grid[0].size();
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid[0].size(); j++) {
				if (grid[i][j] == '1' && arr[i][j] == false) {
					doDFS(i, j, grid);
					count++;
				}
			}
		}
		return count;
	}
};

int main()
{
    cout << "Hello World!\n";
}