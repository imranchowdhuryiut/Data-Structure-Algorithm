#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <set>

using namespace std;

class Solution {
public:
	int countDistinctIntegers(vector<int>& nums) {
		set<int> st;
		for (int i = 0; i < nums.size(); i++) {
			st.insert(nums[i]);
			int n = nums[i];
			int rev = 0;
			while (n != 0) {
				int digit = n % 10;
				rev = (rev * 10) + digit;
				n = n / 10;
			}
			st.insert(rev);
		}
		return st.size();
	}
};

int main()
{
    cout << "Hello World!\n";
}