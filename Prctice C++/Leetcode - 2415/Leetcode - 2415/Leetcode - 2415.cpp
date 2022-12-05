#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

void traverseTree(TreeNode* root1, TreeNode* root2, int parent) {
	if (root1 == nullptr) {
		return;
	}

	if (parent % 2 != 0) {
		int temp = root1->val;
		root1->val = root2->val;
		root2->val = temp;
	}

	traverseTree(root1->left, root2->right, parent + 1);
	traverseTree(root1->right, root2->left, parent + 1);
}

class Solution {
public:
	TreeNode* reverseOddLevels(TreeNode* root) {
		traverseTree(root->left, root->right, 1);
		return root;
	}
};

int main()
{
    cout << "Hello World!\n";
}
