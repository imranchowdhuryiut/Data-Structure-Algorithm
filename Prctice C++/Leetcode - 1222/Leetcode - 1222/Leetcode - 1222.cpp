#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

int arr[8][8];
vector<vector<int>> result;

bool isValidPosition(int x, int y) {
	if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
		return true;
	}
	return false;
}

bool isQueenFound(int x, int y) {
	if (arr[x][y] == 0) {
		return true;
	}
	return false;
}

void findQueenn(int x, int y, int direction) {
	if (isValidPosition(x, y)) {
		if (isQueenFound(x, y)) {
			vector<int> list;
			list.push_back(x);
			list.push_back(y);
			result.push_back(list);
			return;
		}
		else {
			switch (direction) {
			case 0:
				findQueenn(x, y + 1, direction);
				break;
			case 1:
				findQueenn(x + 1, y + 1, direction);
				break;
			case 2:
				findQueenn(x + 1, y, direction);
				break;
			case 3:
				findQueenn(x + 1, y - 1, direction);
				break;
			case 4:
				findQueenn(x, y - 1, direction);
				break;
			case 5:
				findQueenn(x - 1, y - 1, direction);
				break;
			case 6:
				findQueenn(x - 1, y, direction);
				break;
			case 7:
				findQueenn(x - 1, y + 1, direction);
				break;
			}
		}
	}
	else {
		return;
	}
}

class Solution {
public:
	vector<vector<int>> queensAttacktheKing(vector<vector<int>>& queens, vector<int>& king) {
		memset(arr, -1, sizeof(arr));
		result.clear();
		arr[king[0]][king[1]] = 1;
		for (int i = 0; i < queens.size(); i++) {
			arr[queens[i][0]][queens[i][1]] = 0;
		}
		findQueenn(king[0], king[1] + 1, 0);
		findQueenn(king[0] + 1, king[1] + 1, 1);
		findQueenn(king[0] + 1, king[1], 2);
		findQueenn(king[0] + 1, king[1] - 1, 3);
		findQueenn(king[0], king[1] - 1, 4);
		findQueenn(king[0] - 1, king[1] - 1, 5);
		findQueenn(king[0] - 1, king[1], 6);
		findQueenn(king[0] - 1, king[1] + 1, 7);
		return result;
	}
};

int main()
{
	Solution myObj;
	vector<vector<int>> queens = { {0, 0},{1, 1},{2, 2},{3, 4}, {3, 5},{4, 4},{4, 5} };
	vector<int>king = { 3, 3 };
	cout << myObj.queensAttacktheKing(queens, king).size() << endl;
	return 0;
}