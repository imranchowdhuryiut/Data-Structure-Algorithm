#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
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

class Solution {
public:
	vector<vector<int>> levelOrder(TreeNode* root) {
		vector<vector<int>> result;
		if (root == nullptr) {
			return result;
		}
		queue<TreeNode*> q;
		q.push(root);
		while (!q.empty()) {
			int size = q.size();
			vector<int> temp;
			for (int i = 0; i < size; i++) {
				TreeNode* curr = q.front();
				q.pop();
				if (curr != nullptr) {
					temp.push_back(curr->val);
					if (curr->left != nullptr)
						q.push(curr->left);
					if (curr->right != nullptr)
						q.push(curr->right);
				}
			}
			result.push_back(temp);
			temp.clear();
		}
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
}