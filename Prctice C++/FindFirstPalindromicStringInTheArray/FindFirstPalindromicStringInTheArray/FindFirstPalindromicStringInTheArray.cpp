#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>

using namespace std;

bool isPalindrome(string word) {
	for (int i = 0; i < word.length() / 2; i++) {
		if (word[i] != word[word.length() - 1 - i]) {
			return false;
		}
	}
	return true;
}

class Solution {
public:
	string firstPalindrome(vector<string>& words) {
		string result = "";
		for (int i = 0; i < words.size(); i++) {
			if (isPalindrome(words[i])) {
				result = result + words[i];
				return result;
			}
		}
		return result;
	}
};
