#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
	string addSpaces1(string s, vector<int>& spaces) {
		int index = 0;
		string result = "";
		for (int i = 0; i < s.size(); i++) {
			if (index < spaces.size() && i == spaces[index]) {
				result += " ";
				index++;
				i--;
			}
			else {
				result += s[i];
			}
		}
		return result;
	}

	string addSpaces(string s, vector<int>& spaces) {
		string result = "";
		spaces.push_back(s.size());
		int temp = 0;
		for (int i = 0; i < spaces.size(); i++) {
			result += s.substr(temp, spaces[i] - temp);
			temp = spaces[i];
			if (i != spaces.size() - 1) {
				result += " ";
			}
		}
		return result;
	}
		
};

int main()
{
	Solution myObj;
	string s = "LeetcodeHelpsMeLearn";
	vector<int> spaces = { 8, 13, 15 };
    cout << myObj.addSpaces(s, spaces) << endl;
}