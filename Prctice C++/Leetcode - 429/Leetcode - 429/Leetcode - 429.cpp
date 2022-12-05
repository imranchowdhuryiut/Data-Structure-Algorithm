#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <queue>

using namespace std;

class Node {
public:
	int val;
	vector<Node*> children;

	Node() {}

	Node(int _val) {
		val = _val;
	}

	Node(int _val, vector<Node*> _children) {
		val = _val;
		children = _children;
	}
};

class Solution {
public:
	vector<vector<int>> levelOrder(Node* root) {
		vector<vector<int>> result;
		if (root == nullptr) {
			return result;
		}
		else {
			queue<Node*> q;
			q.push(root);
			while (!q.empty()) {
				vector<int> vc;
				int size = q.size();
				for (int i = 0; i < size; i++) {
					Node* curr = q.front();
					q.pop();
					if (curr != nullptr) {
						vc.push_back(curr->val);
						if (!curr->children.empty()) {
							for (int i = 0; i < curr->children.size(); i++) {
								Node* child = curr->children[i];
								q.push(child);
							}
						}
					}
				}
				result.push_back(vc);
				vc.clear();
			}
			return result;
		}
	}
};

int main()
{
    cout << "Hello World!\n";
}