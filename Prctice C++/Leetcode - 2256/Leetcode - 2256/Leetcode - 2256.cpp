#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:

	int minimumAverageDifference(vector<int>& nums) {
		unordered_map<int, long> mp;
		mp[0] = nums[0];
		for (int i = 1; i < nums.size(); i++) {
			mp[i] = mp[i - 1] + nums[i];
		}

		int min = INT_MAX;
		int minIndex = -1;

		for (int i = 0; i < nums.size(); i++) {
			long a = mp[i] / (i + 1);
			long b = (mp[nums.size() - 1] - mp[i]);
			if (b != 0) {
				b = b / (nums.size() - 1 - i);
			}
			int diff = abs(a - b);
			if (diff < min) {
				min = diff;
				minIndex = i;
			}
		}
		return minIndex;
	}


	int minimumAverageDifference2(vector<int>& nums) {
		vector<long> nums2;
		nums2.push_back(nums[0]);
		for (int i = 1; i < nums.size(); i++) {
			nums2.push_back(nums2[i - 1] + nums[i]);
		}

		int min = INT_MAX;
		int minIndex = -1;

		for (int i = 0; i < nums.size(); i++) {
			long a = nums2[i] / (i + 1);
			long b = (nums2[nums.size() - 1] - nums2[i]);
			if (b != 0) {
				b = b / (nums.size() - 1 - i);
			}
			int diff = abs(a - b);
			if (diff < min) {
				min = diff;
				minIndex = i;
			}
		}
		return minIndex;
	}
};

int main()
{
	Solution myObj;
	vector<int> nums = { 2, 5, 3, 9, 5, 3 };
	myObj.minimumAverageDifference(nums);
    cout << "Hello World!\n";
}