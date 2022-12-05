#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class Solution {
public:
	int triangularSum(vector<int>& nums) {
		queue<int> Q;
		int length = nums.size();
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			Q.push(nums[i]);
		}
		while (Q.size() != 1) {
			count++;
			int a = Q.front();
			Q.pop();
			int b = Q.front();
			Q.push((a + b) % 10);
			if (count == length - 1) {
				Q.pop();
				length = count;
				count = 0;
			}
		}
		return Q.front();
	}
};

int main()
{
	Solution myObj;
	vector<int> vc = { 1,2,3,4,5};

    cout << myObj.triangularSum(vc) << endl;
}