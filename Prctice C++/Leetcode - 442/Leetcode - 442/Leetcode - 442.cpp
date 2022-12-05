#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
	vector<int> findDuplicates(vector<int>& nums) {
		vector<int> result;
		unordered_map<int, int> mp;
		for (int i = 0; i < nums.size(); i++) {
			mp[nums[i]]++;
			if (mp[nums[i]] == 2) {
				result.push_back(nums[i]);
			}
		}
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
}