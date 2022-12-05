#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <unordered_map>
#include <string>

using namespace std;

unordered_map<string, int> mp;

class Solution {
public:
	int longestPalindrome(vector<string>& words) {
		mp.clear();
		for (int i = 0; i < words.size(); i++) {
			mp[words[i]]++;
		}
		bool flag = false;
		int count = 0;
		for (int i = 0; i < words.size(); i++) {
			string word = words[i];
			string rev = word;
			reverse(rev.begin(), rev.end());
			if (word == rev && mp[word] > 1) {
				count += 4;
				mp[word] -= 2;
			}
			else if (word != rev && mp[word] > 0 && mp[rev] > 0) {
				count += 4;
				mp[word]--;
				mp[rev]--;
			}
			else if (!flag && word == rev && mp[word] > 0) {
				count += 2;
				flag = true;
				mp[word]--;
			}
		}
		return count;
	}
};

int main()
{
    cout << "Hello World!\n";
}