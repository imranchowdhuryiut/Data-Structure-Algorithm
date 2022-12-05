#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
	int minimumSum(int num) {
		vector<int> arr;
		while (num != 0)
		{
			int digit = num % 10;
			arr.push_back(digit);
			num = num / 10;
		}
		sort(arr.begin(), arr.end());
		int num2 = arr[1] * 10 + arr[3];
		int num1 = arr[0] * 10 + arr[2];
		return num2 + num1;
	}
};

int main()
{
	Solution myObj;
    cout << myObj.minimumSum(4009);
}