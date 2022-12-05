#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
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

void doDFS(TreeNode* root, vector<int> &vc) {
	if (root == nullptr) {
		return;
	}
	
	vc.push_back(root->val);
	doDFS(root->left, vc);
	doDFS(root->right, vc);
}

class Solution {
public:
	vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
		vector<int> vc;
		doDFS(root1, vc);
		doDFS(root2, vc);
		sort(vc.begin(), vc.end());
		return vc;
	}
};

int main()
{
    cout << "Hello World!\n";
}
