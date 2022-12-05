#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void permutation(vector<vector<int>>& arr, vector<int>& nums, vector<int>& permu) {
	if (nums.size() == permu.size()) {
		vector<int> final;
		for (int i = 0; i < permu.size(); i++)
		{
			final.push_back(nums[permu[i]]);
		}
		arr.push_back(final);
		return;
	}

	vector<int> pervlist;
	for (int i = 0; i < nums.size(); i++) {
		if (find(pervlist.begin(), pervlist.end(), nums[i]) != pervlist.end()) {
			continue;
		}

		if (find(permu.begin(), permu.end(), i) != permu.end()) {
			continue;
		}

		pervlist.push_back(nums[i]);
		permu.push_back(i);
		permutation(arr, nums, permu);
		permu.erase(permu.begin() + permu.size() - 1);
	}
}

class Solution {
public:
	vector<vector<int>> permute(vector<int>& nums) {
		vector<vector<int>> arr;
		vector<int> permu;
		permutation(arr, nums, permu);
		return arr;
	}
};

int main()
{
	int arr[] = {1, 2, 3};
	Solution myObj;
    cout << "Hello World!\n";
	return 0;
}