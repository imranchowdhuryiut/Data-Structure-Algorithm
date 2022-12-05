// Trie.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
using namespace std;
struct Node{
	Node *child[26];
	bool isWord;
};

Node *getNewNode() {
	Node *curr = new Node;
	for (int i = 0; i < 26; i++) {
		curr->child[i] = nullptr;
	}
	curr->isWord = false;
	return curr;
}
Node *root = getNewNode();
void addInTrie(string s) {
	Node *curr = root;
	for (int i = 0; i < s.size(); i++) {
		int c = s[i] - 'a';
		if (curr->child[c] == nullptr) {
			curr->child[c] = getNewNode();
		}
		curr = curr->child[c];
	}
	curr->isWord = true;
}
bool searchWord(string s) {
	Node *curr = root;
	for (int i = 0; i < s.size(); i++) {
		int c = s[i] - 'a';
		if (curr->child[c] == nullptr)
			return false;
		curr = curr->child[c];
	}
	if (curr->isWord)
		return true;
	return false;
}
int main()
{
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		string s;
		cin >> s;
		addInTrie(s);
	}
	string s;
	cin >> s;

	bool a = searchWord(s);
	cout << a << endl;
    //std::cout << "Hello World!\n";
}

