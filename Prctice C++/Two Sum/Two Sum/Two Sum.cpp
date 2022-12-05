#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
	vector<int> twoSum(vector<int>& nums, int target) {
		unordered_map<int, int> mp;
		vector<int> result;
		for (int i = 0; i < nums.size(); i++) {
			int numToFind = target - nums[i];
			if (mp.find(numToFind) != mp.end()) {
				result.push_back(i);
				result.push_back(mp[numToFind]);
				return result;
			}
			mp[nums[i]] = i;
		}
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
}