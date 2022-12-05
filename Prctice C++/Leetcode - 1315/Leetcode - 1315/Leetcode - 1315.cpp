#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <queue>
#include <vector>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

int sum;

void doDFS(TreeNode* root, int level) {
	if (root == nullptr) {
		return;
	}

	if (root->val % 2 == 0) {
		if (root->left != nullptr) {
			if (root->left->left != nullptr) {
				sum += root->left->left->val;
			}
			if (root->left->right != nullptr) {
				sum += root->left->right->val;
			}
		}
		if (root->right != nullptr) {
			if (root->right->left != nullptr) {
				sum += root->right->left->val;
			}
			if (root->right->right != nullptr) {
				sum += root->right->right->val;
			}
		}
	}
	doDFS(root->left, level + 1);
	doDFS(root->right, level + 1);
}

class Solution {
public:
	int sumEvenGrandparent(TreeNode* root) {
		sum = 0;
		doDFS(root, 0);
		return sum;
	}
};

int main()
{
    cout << "Hello World!\n";
	return 0;
}