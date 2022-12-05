#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <limits.h>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

int goodNodeCount = 0;

void doDFS(TreeNode* root, int maxParent) {
	if (root == nullptr) {
		return;
	}
	if (root->val >= maxParent) {
		goodNodeCount++;
		maxParent = root->val;
	}
	doDFS(root->left, maxParent);
	doDFS(root->right, maxParent);
}

class Solution {
public:
	int goodNodes(TreeNode* root) {
		goodNodeCount = 0;
		doDFS(root, INT_MIN);
		return goodNodeCount;
	}
};

int main()
{
    cout << "Hello World!\n";
	return 0;
}