#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

int MAX_ROW;
int MAX_COL;
bool arr[6][6];

bool isValid(int x, int y) {
	if (x >= 0 && x < MAX_ROW && y >= 0 && y < MAX_COL) {
		return true;
	}
	return false;
}

bool isPreviouslySeen(int x, int y) {
	if (arr[x][y] == true) {
		return true;
	}
	return false;
}


bool searchWord(int x, int y, vector<vector<char>>& board, string word, int position) {
	if (position == word.size()) {
		return true;
	}

	if (!isValid(x, y)) {
		return false;
	}

	// if (isPreviouslySeen(x, y)) {
	// 	return false;
	// }

	if (board[x][y] != word[position]) {
		return false;
	}

	char c = board[x][y];
	board[x][y] = '*';
	bool furtherSearch = searchWord(x + 1, y, board, word, position + 1)
		|| searchWord(x - 1, y, board, word, position + 1)
		|| searchWord(x, y + 1, board, word, position + 1)
		|| searchWord(x, y - 1, board, word, position + 1);
	board[x][y] = c;
	return furtherSearch;
}

class Solution {
public:
	bool exist(vector<vector<char>>& board, string word) {
		MAX_ROW = board.size();
		MAX_COL = board[0].size();
		for (int i = 0; i < MAX_ROW; i++) {
			for (int j = 0; j < MAX_COL; j++) {
				memset(arr, false, sizeof(arr));
				bool isExist = searchWord(i, j, board, word, 0);
				if (isExist) {
					return true;
				}
			}
		}
		return false;
	}
};

int main()
{
    cout << "Hello World!\n";
}