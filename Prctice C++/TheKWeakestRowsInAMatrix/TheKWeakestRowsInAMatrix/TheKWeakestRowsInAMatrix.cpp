#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct MyStruct
{
	int soilderCount;
	int rowNo;

	MyStruct() {
		this->soilderCount = 0;
		this->rowNo = 0;
	}

	MyStruct(int _soilderCount, int _rowNo) {
		this->soilderCount = _soilderCount;
		this->rowNo = _rowNo;
	}

	bool operator < (const MyStruct &d) const {
		if (soilderCount == d.soilderCount) {
			return rowNo > d.rowNo;
		}
		else {
			return soilderCount > d.soilderCount;
		}
	}
};

class Solution {
public:
	vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
		vector<int> result;
		priority_queue<MyStruct> pq;
		for (int i = 0; i < mat.size(); i++) {
			MyStruct mydata;
			mydata.rowNo = i;
			int soilderCount = 0;
			for (int j = 0; j < mat[i].size(); j++) {
				if (mat[i][j] == 1) {
					soilderCount++;
				}
			}
			mydata.soilderCount = soilderCount;
			pq.push(mydata);
		}
		while (k--) {
			MyStruct temp = pq.top();
			result.push_back(temp.rowNo);
			pq.pop();
		}
		return result;
	}
};

int main()
{
	vector<vector<int>> mat =
	{ 
		{1, 1, 0, 0, 0},
		{1, 1, 1, 1, 0},
		{1, 0, 0, 0, 0},
		{1, 1, 0, 0, 0},
		{1, 1, 1, 1, 1}
	};
	Solution myObj;
	vector<int> result = myObj.kWeakestRows(mat, 3);

	return 0;
}