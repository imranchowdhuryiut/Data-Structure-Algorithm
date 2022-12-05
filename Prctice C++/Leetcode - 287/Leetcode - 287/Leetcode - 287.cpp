#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
	int findDuplicate(vector<int>& nums) {
		unordered_map<int, int> mp;
		for (int i = 0; i < nums.size(); i++) {
			mp[nums[i]]++;
			if (mp[nums[i]] == 2) {
				return nums[i];
			}
		}
		return 0;
	}
};

int main()
{
    cout << "Hello World!\n";
}
