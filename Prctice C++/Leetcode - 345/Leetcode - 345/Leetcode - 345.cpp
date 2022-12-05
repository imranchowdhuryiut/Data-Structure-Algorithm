#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
public:
	string reverseVowels(string s) {
		int low = 0;
		vector<char> vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		unordered_map<char, bool> mp;
		for (int i = 0; i < vowels.size(); i++) {
			mp[vowels[i]] = true;
		}
		int high = s.size() - 1;
		while (low <= high) {
			if (mp[s[high]] == true && mp[s[low]] == true) {
				char temp = s[low];
				s[low] = s[high];
				s[high] = temp;
				low++;
				high--;
			}
			else {
				if (mp[s[low]] == false) {
					low++;
				}
				if (mp[s[high]] == false) {
					high--;
				}
			}
		}
		return s;
	}
};

int main()
{
    cout << "Hello World!\n";
}
