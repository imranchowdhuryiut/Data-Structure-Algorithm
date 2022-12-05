#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
	string makeGood(string s) {
		bool isGreat = false;
		while (!isGreat) {
			int count = 0;
			for (int i = 0; i < s.size() - 1; i++) {
				if (s[i] == s[i + 1] - 32 || s[i] - 32 == s[i + 1]) {
					s.erase(s.begin() + i);
					s.erase(s.begin() + i);
					count++;
				}
				if (s.empty()) {
					break;
				}
			}
			if (count == 0 || s.empty()) {
				isGreat = true;
			}
		}
		return s;
	}
};

int main()
{
	Solution myObj;

    cout << myObj.makeGood("abBAcC") << endl;

	return 0;
}