#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <map>

using namespace std;

#define pa pair<int, int>
map<pa, int> mp;

bool isValidPosition(int x, int y, int row, int col) {
	if (x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1) {
		return true;
	}
	return false;
}

bool isAlreadySetToZero(int x, int y) {
	pa pos = pa(x, y);
	if (mp[pos] == 1) {
		return true;
	}
	else {
		return false;
	}
}

void setZeroToFourDirection(int x, int y, int direction, vector<vector<int>>& matrix) {
	if (isValidPosition(x, y, matrix.size(), matrix[0].size())) {
		if (matrix[x][y] == 0) {
			switch (direction) {
			case 1:
				setZeroToFourDirection(x, y + 1, direction, matrix);
				break;
			case 2:
				setZeroToFourDirection(x + 1, y, direction, matrix);
				break;
			case 3:
				setZeroToFourDirection(x, y - 1, direction, matrix);
				break;
			case 4:
				setZeroToFourDirection(x - 1, y, direction, matrix);
				break;
			}
		}
		else {
			if (isAlreadySetToZero(x, y)) {
				return;
			}
			else {
				matrix[x][y] = 0;
				pa pos = pa(x, y);
				mp[pos] = 1;
				switch (direction) {
				case 1:
					setZeroToFourDirection(x, y + 1, direction, matrix);
					break;
				case 2:
					setZeroToFourDirection(x + 1, y, direction, matrix);
					break;
				case 3:
					setZeroToFourDirection(x, y - 1, direction, matrix);
					break;
				case 4:
					setZeroToFourDirection(x - 1, y, direction, matrix);
					break;
				}
			}
		}
	}
	else {
		return;
	}
}

class Solution {
public:
	void setZeroes(vector<vector<int>>& matrix) {
		mp.clear();
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix[i].size(); j++) {
				if (matrix[i][j] == 0) {
					pa pos = pa(i, j);
					if (mp[pos] == 0) {
						mp[pos] = 1;
						setZeroToFourDirection(i, j + 1, 1, matrix);
						setZeroToFourDirection(i + 1, j, 2, matrix);
						setZeroToFourDirection(i, j - 1, 3, matrix);
						setZeroToFourDirection(i - 1, j, 4, matrix);
					}
				}
			}
		}
	}
};

int main()
{
	Solution myObj;
	vector<vector<int>> mat = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
	myObj.setZeroes(mat);
	return 0;
}