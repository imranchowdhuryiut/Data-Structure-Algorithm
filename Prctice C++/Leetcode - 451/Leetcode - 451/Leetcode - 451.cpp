#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <string>
#include <algorithm>
#include <vector>
#include <unordered_map>

#define pa pair<int, char>

using namespace std;

class Solution {
public:
	string frequencySort(string s) {
		unordered_map<char, int> mp;
		unordered_map<char, int> ::iterator it;
		vector<pa> vc;
		string result = "";
		for (int i = 0; i < s.length(); i++) {
			mp[s[i]]++;
		}
		for (it = mp.begin(); it != mp.end(); it++) {
			pa temp = pa((*it).second, (*it).first);
			vc.push_back(temp);
		}
		sort(vc.begin(), vc.end());
		for (int i = vc.size() - 1; i >= 0; i--) {
			result += string(vc[i].first, vc[i].second);
		}
		return result;
	}
};

int main()
{
	Solution myObj;
    cout << myObj.frequencySort("treeeeeeeeeee")<< endl;
}