#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
	int strStr(string haystack, string needle) {
		int position = -1;
		int size = needle.size();
		if (haystack.size() > needle.size()) {
			for (int i = 0; i < haystack.size() - size + 1; i++) {
				string subNeedle = haystack.substr(i, size);
				if (needle == subNeedle) {
					position = i;
					break;
				}
			}
		}
		else if (haystack.size() == needle.size()) {
			if (haystack == needle) {
				position = 0;
			}
		}
		return position;
	}
};

int main()
{
	Solution myObj;
	myObj.strStr("abc", "c");
    cout << "Hello World!\n";
}