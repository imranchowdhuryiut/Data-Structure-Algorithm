#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <stdio.h>
#include <string>
#include <algorithm>

using namespace std;

int a = 0;

void permutation(string word, vector<int> &arr) {
	if (arr.size() == word.size()) {
		a++;
		for (int i = 0; i < arr.size(); i++) {
			printf("%c", word[arr[i]]);
		}
		printf("\n");
	}
	vector<char> prevList;
	for (int i = 0; i < word.size(); i++) {
		if (find(prevList.begin(), prevList.end(), word[i]) != prevList.end()) {
			continue;
		}
		if (find(arr.begin(), arr.end(), i) != arr.end()) {
			continue;
		}
		prevList.push_back(word[i]);
		arr.push_back(i);
		permutation(word, arr);
		arr.erase(arr.begin() + arr.size() - 1);
	}
}

int main()
{
	int t;
	vector<int> arr;
	scanf("%d", &t);
	while (t--) {
		string word;
		a = 0;
		cin >> word;
		permutation(word, arr);
		printf("%d\n", a);
	}
}