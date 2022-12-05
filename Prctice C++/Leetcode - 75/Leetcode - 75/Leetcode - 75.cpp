#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	int count0;
	int count1;
	int count2;

	void sortColors(vector<int>& nums) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < nums.size(); i++) {
			int num = nums[i];
			if (num == 0) {
				count0++;
			}
			else if (num == 1) {
				count1++;
			}
			else {
				count2++;
			}
		}
		nums.clear();
		for (int i = 1; i <= count0; i++) {
			nums.push_back(0);
		}
		for (int i = 1; i <= count1; i++) {
			nums.push_back(1);
		}
		for (int i = 1; i <= count2; i++) {
			nums.push_back(2);
		}
	}
};

int main()
{
    cout << "Hello World!\n";
}