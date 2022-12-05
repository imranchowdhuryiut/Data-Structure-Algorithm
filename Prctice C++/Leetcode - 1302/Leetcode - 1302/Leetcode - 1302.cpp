#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

struct Data {
	int level;
	int value;

	Data(int val, int lvl) {
		this->level = lvl;
		this->value = val;
	}

	bool operator < (const Data &d) const {
		return level < d.level;
	}
};

vector<Data> vc;

void traverseTree(TreeNode* root, int parent) {
	if (root == nullptr) {
		return;
	}
	Data data = Data(root->val, parent + 1);
	vc.push_back(data);
	traverseTree(root->left, parent + 1);
	traverseTree(root->right, parent + 1);
}

class Solution {
public:
	int deepestLeavesSum(TreeNode* root) {
		vc = vector<Data>();
		Data data = Data(root->val, 0);
		vc.push_back(data);
		traverseTree(root->left, 0);
		traverseTree(root->right, 0);
		int depestLevel = -1;
		int sum = 0;
		sort(vc.begin(), vc.end());
		for (int i = vc.size() - 1; i >= 0; i--) {
			if (depestLevel == -1) {
				depestLevel = vc[i].level;
			}
			if (vc[i].level < depestLevel) {
				break;
			}
			if (vc[i].level == depestLevel) {
				sum += vc[i].value;
			}
		}
		return sum;
	}
};

int main()
{
    cout << "Hello World!\n";
}