#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
	int minimumOperations(vector<int>& nums) {
		int steps = 0;
		sort(nums.begin(), nums.end());
		int temp = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums[i] == 0) {
				continue;
			}
			else if (temp == 0){
				temp = nums[i];
				steps++;
			}
			else {
				if (nums[i] - temp == 0) {
					continue;
				}
				else {
					temp += nums[i] - temp;
					steps++;
				}
			}
		}
		return steps;
	} 
};

int main()
{
	vector<int> nums = {1, 5, 0, 3, 5};
	Solution mySolution;
	cout << mySolution.minimumOperations(nums) << endl;
}
