#include <iostream>
#include <stdio.h>
#include <vector>

using namespace std;

class Solution {
public:
	vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
		vector<int> result;
		for (int i = 0; i < nums.size(); i++) {
			int position = index[i];
			result.insert(result.begin() + position, nums[i]);
		}
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
}