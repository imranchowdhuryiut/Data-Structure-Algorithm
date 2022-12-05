#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <string>

using namespace std;

class Solution {
public:
	int maximum69Number(int num) {
		string numString = to_string(num);
		for (int i = 0; i < numString.length(); i++) {
			if (numString[i] == '6') {
				numString[i] = '9';
				break;
			}
		}
		return stoi(numString);
	}
};

int main()
{
	Solution myObj;
	cout << myObj.maximum69Number(9999) << endl;
	return 0;
}