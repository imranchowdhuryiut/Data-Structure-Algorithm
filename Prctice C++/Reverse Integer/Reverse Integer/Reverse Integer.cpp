#include <iostream>
#include <stdio.h>
#include <limits.h>

using namespace std;

class Solution {
public:
	int reverse(int x) {
		if (x == INT_MAX || x == INT_MIN) {
			return 0;
		}
		int multiplier = 1;
		long long int result = 0;
		if (x < 0) {
			multiplier = -1;
			x = x * -1;
		}
		while (x != 0) {
			int digit = x % 10;
			result = result * 10 + digit;
			if (result > 2147483648) {
				return 0;
			}
			x = x / 10;
		}
		int signedInt = (int)result;
		return  signedInt * multiplier;
	}
};

int main() {
	Solution obj1;

	int reverse = obj1.reverse(1534236469);
	printf("%d\n", reverse);
	return 0;
}