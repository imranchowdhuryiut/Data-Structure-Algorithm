#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>

using namespace std;

class Solution {
public:
	vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& queries) {
		int sum = 0;
		vector<int> vc;
		for (int i = 0; i < nums.size(); i++) {
			if (nums[i] % 2 == 0) {
				sum = sum + nums[i];
			}
		}
		for (int i = 0; i < queries.size(); i++) {
			int val = queries[i][0];
			int index = queries[i][1];
			int arrVal = nums[index];
			if (arrVal % 2 == 0) {
				nums[index] = nums[index] + val;
				if (nums[index] % 2 == 0) {
					int temp = nums[index] - arrVal;
					sum = sum + temp;
				}
				else {
					sum = sum - arrVal;
				}
			}
			else {
				nums[index] = nums[index] + val;
				if (nums[index] % 2 == 0) {
					sum = sum + nums[index];
				}
			}
			vc.push_back(sum);
		}
		return vc;
	}
};

int main()
{
	Solution myObj;
	vector<int> nums = { 1, 2, 3, 4 }; 
	vector<vector<int> > queries = { {1, 0},{-3, 1},{-4, 0},{2, 3} };
	myObj.sumEvenAfterQueries(nums, queries);
	return 0;
}