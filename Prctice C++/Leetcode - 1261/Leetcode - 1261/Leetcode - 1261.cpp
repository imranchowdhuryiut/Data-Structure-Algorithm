#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <unordered_map>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

void doDFS(TreeNode* root, int parent, unordered_map<int, bool> &mp, int direction) {
	if (root == nullptr) {
		return;
	}
	int val;
	if (direction == -1) {
		val = 2 * parent + 1;
		mp[val] = true;
	}
	else {
		val = 2 * parent + 2;
		mp[val] = true;
	}
	doDFS(root->left, val, mp, -1);
	doDFS(root->right, val, mp, 1);
}

class FindElements {
public:

	unordered_map<int, bool> mp;

	FindElements(TreeNode* root) {
		mp.clear();
		mp[0] = true;
		doDFS(root->left, 0, mp, -1);
		doDFS(root->right, 0, mp, 1);
	}

	bool find(int target) {
		return mp[target];
	}
};

int main()
{
    cout << "Hello World!\n";
	return 0;
}