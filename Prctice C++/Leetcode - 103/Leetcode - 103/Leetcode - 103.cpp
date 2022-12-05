#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <deque>

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
	vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
		vector<vector<int>> result;
		if (root == nullptr) {
			return result;
		}
		else {
			deque<TreeNode*> dq;
			dq.push_back(root);
			int level = 0;
			while (!dq.empty()) {
				level++;
				int size = dq.size();
				vector<int> vc;
				for (int i = 0; i < size; i++) {
					TreeNode* curr = dq.front();
					dq.pop_front();
					if (curr != nullptr) {
						vc.push_back(curr->val);
						if (curr->left != nullptr) {
							dq.push_back(curr->left);
						}
						if (curr->right != nullptr) {
							dq.push_back(curr->right);
						}
					}
				}
				if (level % 2 == 0) {
					for (int i = 0; i < vc.size() / 2; i++) {
						int temp = vc[i];
						vc[i] = vc[vc.size() - 1 - i];
						vc[vc.size() - 1 - i] = temp;
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