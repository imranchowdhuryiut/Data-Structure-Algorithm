#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
	string reverseWords(string s) {
		vector<string> vc;
		int size = s.size();
		for (int i = 0; i < s.size(); i++) {
			string currentWord = "";
			if (s[i] == ' ') {
				continue;
			}
			else {
				currentWord += s[i];
				int j = i + 1;
				while (s[j] != ' ' && j < size) {
					currentWord += s[j];
					j++;
				}
				i = j;
				vc.push_back(currentWord);
				currentWord.clear();
			}
		}
		string result = "";
		for (int i = vc.size() - 1; i >= 0; i--) {
			result += vc[i];
			if (i != 0) {
				result += " ";
			}
		}
		return result;
	}
};

int main()
{
	Solution myObj;
	cout << myObj.reverseWords("    Hello   World  ") << endl;
}
