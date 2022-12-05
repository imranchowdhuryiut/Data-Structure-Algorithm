#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>
#include <queue>

using namespace std;

unordered_map<string, int> mp;
unordered_map<string, bool> isVisited;

class Solution {
public:
	int minMutation(string start, string end, vector<string>& bank) {
		mp.clear();
		isVisited.clear();
		string genes = "ACGT";
		queue<string> Q;
		for (int i = 0; i < bank.size(); i++) {
			mp[bank[i]] = 1;
		}
		Q.push(start);
		int level = 0;
		isVisited[start] = true;
		while (!Q.empty()) {
			int size = Q.size();
			for (int i = 0; i < size; i++) {
				string s = Q.front();
				Q.pop();
				if (s == end) {
					return level;
				}
				for (int j = 0; j < 8; j++) {
					char oc = s[j];
					for (int k = 0; k < 4; k++) {
						s[j] = genes[k];
						if (mp[s] != 0 && isVisited[s] == false) {
							isVisited[s] = true;
							Q.push(s);
						}
						s[j] = oc;
					}
				}
			}
			level++;
		}
		return -1;
	}
};

int main()
{
    cout << "Hello World!\n";
}