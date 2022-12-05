#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
	bool closeStrings(string word1, string word2) {
		if (word1.size() != word2.size()) {
			return false;
		}

		int arr1[26];
		int arr2[26];

		memset(arr1, 0, sizeof(arr1));
		memset(arr2, 0, sizeof(arr2));

		for (int i = 0; i < word1.size(); i++) {
			arr1[word1[i] - 'a']++;
		}

		for (int i = 0; i < word2.size(); i++) {
			arr2[word2[i] - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if ((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0)) {
				return false;
			}
		}

		vector<int> vc1;
		vector<int> vc2;

		for (int i = 0; i < 26; i++) {
			if (arr1[i] != 0) {
				vc1.push_back(arr1[i]);
			}
			if (arr2[i] != 0) {
				vc2.push_back(arr2[i]);
			}
		}

		sort(vc1.begin(), vc1.end());
		sort(vc2.begin(), vc2.end());

		for (int i = 0; i < vc1.size(); i++) {
			if (vc1[i] != vc2[i]) {
				return false;
			}
		}
		return true;
	}
};

int main()
{
	Solution myObj;
	myObj.closeStrings("abc", "bca");
    cout << "Hello World!\n";
}