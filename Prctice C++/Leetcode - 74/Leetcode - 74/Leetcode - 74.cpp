#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	bool searchMatrix(vector<vector<int>>& matrix, int target) {
		int rowLow = 0;
		int rowHigh = matrix.size() - 1;
		int rowToSearch;
		bool isRowFound = false;
		if (matrix.size() > 1) {
			while (rowLow <= rowHigh) {
				int mid = rowLow + (rowHigh - rowLow) / 2;
				if (mid == matrix.size() - 1) {
					rowToSearch = mid;
					isRowFound = true;
					break;
				}
				if (matrix[mid][0] == target) {
					rowToSearch = mid;
					isRowFound = true;
					break;
				}
				if (mid + 1 < matrix.size() && matrix[mid + 1][0] == target) {
					rowToSearch = mid + 1;
					isRowFound = true;
					break;
				}
				if (mid + 1 < matrix.size() && matrix[mid][0] < target && matrix[mid + 1][0] > target) {
					rowToSearch = mid;
					isRowFound = true;
					break;
				}
				else if (mid + 1 < matrix.size() && matrix[mid][0] < target && matrix[mid + 1][0] < target) {
					rowLow = mid + 1;
				}
				else {
					rowHigh = mid - 1;
				}
			}
		}
		else {
			isRowFound = true;
			rowToSearch = 0;
		}

		if (isRowFound) {
			int colLow = 0;
			int colHigh = matrix[rowToSearch].size() - 1;
			while (colLow <= colHigh) {
				int mid = colLow + (colHigh - colLow) / 2;
				if (matrix[rowToSearch][mid] == target) {
					return true;
				}
				else if (matrix[rowToSearch][mid] < target) {
					colLow = mid + 1;
				}
				else {
					colHigh = mid - 1;
				}
			}
			return false;
		}
		else {
			return false;
		}

	}
};

int main()
{
	vector<vector<int>> mat = { {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50} };
	Solution myObj;
	myObj.searchMatrix(mat, 30);
    cout << "Hello World!\n";
}