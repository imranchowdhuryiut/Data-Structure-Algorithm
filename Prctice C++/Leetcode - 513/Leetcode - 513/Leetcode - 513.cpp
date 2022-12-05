#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <queue>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

struct Node {
	int val;
	int level;
	Node(int val, int level) {
		this->val = val;
		this->level = level;
	}

	bool operator < (const Node &d) const {
		return level < d.level;
	}

};

void doDFS(TreeNode* root, int parent, priority_queue<Node> &pq) {
	if (root == nullptr) {
		return;
	}
	if (root->left != nullptr) {
		Node data = Node(root->left->val, parent + 1);
		pq.push(data);
	}
	else {
		if (root->right != nullptr) {
			Node data = Node(root->right->val, parent + 1);
			pq.push(data);
		}
	}
	doDFS(root->left, parent + 1, pq);
	doDFS(root->right, parent + 1, pq);
}

class Solution {
public:
	int findBottomLeftValue(TreeNode* root) {
		if (root->left == nullptr && root->right == nullptr) {
			return root->val;
		}
		priority_queue<Node> pq;
		Node data = Node(root->val, 0);
		pq.push(data);
		doDFS(root, 0, pq);
		return pq.top().val;
	}
};

int main()
{
    cout << "Hello World!\n";
}