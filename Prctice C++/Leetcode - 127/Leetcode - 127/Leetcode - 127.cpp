#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <unordered_map>
#include <queue>
#include <string>

using namespace std;

unordered_map<string, int> mp;
unordered_map<string, bool> isVisited;

class Solution {
public:
	int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
		
		mp.clear();
		isVisited.clear();
		queue<string> Q;
		string charList = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < wordList.size(); i++) {
			mp[wordList[i]] = 1;
		}

		int level = 1;
		Q.push(beginWord);
		isVisited[beginWord] = true;

		while (!Q.empty())
		{
			int size = Q.size();
			for (int i = 0; i < size; i++) {
				string word = Q.front();
				Q.pop();
				if (word == endWord) {
					return level;
				}
				for (int j = 0; j < word.size(); j++) {
					char charAtPos = word[j];
					for (int k = 0; k < 26; k++) {
						word[j] = charList[k];
						if (mp[word] != 0 && isVisited[word] == false) {
							isVisited[word] = true;
							Q.push(word);
						}
					}
					word[j] = charAtPos;
				}
			}
			level++;
		}
		return 0;
	}
};

int main()
{
    std::cout << "Hello World!\n";
}
