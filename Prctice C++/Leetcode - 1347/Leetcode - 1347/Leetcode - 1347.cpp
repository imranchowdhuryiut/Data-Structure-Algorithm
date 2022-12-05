#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
	int minSteps(string s, string t) {
		int arrS[26];
		int count = 0;
		memset(arrS, 0, sizeof(arrS));

		for (int i = 0; i < s.size(); i++) {
			arrS[s[i] - 'a']++;
		}

		for (int i = 0; i < t.size(); i++) {
			arrS[t[i] - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (arrS[i] > 0) {
				count += arrS[i];
			}
		}
		
		return count;
	}
};

int main()
{
    cout << "Hello World!\n";
}