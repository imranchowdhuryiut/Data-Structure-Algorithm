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
	vector<vector<int>> levelOrderBottom(TreeNode* root) {
		vector<vector<int>> result;
		if (root == nullptr) {
			return result;
		}
		else {
			queue<TreeNode*> q;
			q.push(root);
			while (!q.empty()) {
				int size = q.size();
				vector<int> vc;
				for (int i = 0; i < size; i++) {
					TreeNode* curr = q.front();
					q.pop();
					if (curr != nullptr) {
						vc.push_back(curr->val);
						if (curr->left != nullptr) {
							q.push(curr->left);
						}
						if (curr->right != nullptr) {
							q.push(curr->right);
						}
					}
				}
				result.push_back(vc);
				vc.clear();
			}
			for (int i = 0; i < result.size() / 2; i++) {
				vector<int> temp = result[i];
				result[i] = result[result.size() - 1 - i];
				result[result.size() - 1 - i] = temp;
			}
			return result;
		}
	}
};

int main()
{
    cout << "Hello World!\n";
}