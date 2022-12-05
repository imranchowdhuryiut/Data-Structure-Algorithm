#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>

using namespace std;

class Solution {
public:
	bool isPowerOfFour(int n) {
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		return (n % 4 == 0) && isPowerOfFour(n / 4);
	}
};

int main()
{
    std::cout << "Hello World!\n";
}