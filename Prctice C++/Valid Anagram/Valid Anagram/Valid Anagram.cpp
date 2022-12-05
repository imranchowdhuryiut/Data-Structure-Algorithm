

#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
	bool isAnagram(string s, string t) {
		int arrSource[26];
		int arrTarget[26];
		memset(arrSource, 0, sizeof(arrSource));
		memset(arrTarget, 0, sizeof(arrTarget));
		for (int i = 0; i < s.size(); i++) {
			arrSource[s[i] - 97]++;
		}

		for (int i = 0; i < t.size(); i++) {
			arrTarget[t[i] - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			if (arrSource[i] != arrTarget[i]) {
				return false;
			}
		}
		return true;
	}
};

int main()
{
	Solution myObj;
    cout << myObj.isAnagram("anagram", "nagaram");
	return 0;
}