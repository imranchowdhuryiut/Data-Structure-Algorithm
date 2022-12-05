#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:

	unordered_map<int, vector<int>> mp;

	Solution(vector<int>& nums) {
		mp.clear();
		for (int i = 0; i < nums.size(); i++) {
			mp[nums[i]].push_back(i);
		}
	}

	int pick(int target) {
		vector<int> picked = mp[target];
		int n = picked.size();
		return picked[rand() % n];
	}
};


int main()
{
    cout << "Hello World!\n";
	return 0;
}