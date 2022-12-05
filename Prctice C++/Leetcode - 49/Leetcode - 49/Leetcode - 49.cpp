#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>

using namespace std;

class Solution {
public:
	vector<vector<string>> groupAnagrams(vector<string>& strs) {
		vector<vector<string>> result;
		unordered_map<string, vector<string>> mp;
		for (int i = 0; i < strs.size(); i++) {
			string sortedString = strs[i];
			sort(sortedString.begin(), sortedString.end());
			mp[sortedString].push_back(strs[i]);
		}

		for (auto it : mp) {
			vector<string> temp;
			vector<string> list = it.second;
			for (int i = 0; i < list.size(); i++) {
				temp.push_back(list[i]);
			}
			result.push_back(temp);
		}
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
	return 0;
}