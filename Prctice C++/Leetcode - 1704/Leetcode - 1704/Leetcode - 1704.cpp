#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class Solution {
public:
	bool halvesAreAlike(string s) {
		int size = s.size();
		transform(s.begin(), s.end(), s.begin(), ::tolower);
		string string1 = "";
		string string2 = "";
		for (int i = 0; i < size / 2; i++) {
			string1 = string1 + s[i];
		}
		for (int i = size / 2; i < s.size(); i++) {
			string2 = string2 + s[i];
		}
		int count = 0;
		for (int i = 0; i < string1.size(); i++) {
			if (string1[i] == 'a' || string1[i] == 'e' || string1[i] == 'i' || string1[i] == 'o' || string1[i] == 'u') {
				count++;
			}
		}
		for (int i = 0; i < string2.size(); i++) {
			if (string2[i] == 'a' || string2[i] == 'e' || string2[i] == 'i' || string2[i] == 'o' || string2[i] == 'u') {
				count--;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;
	}
};

int main()
{
	Solution myObj;
	myObj.halvesAreAlike("Book");
    std::cout << "Hello World!\n";
}