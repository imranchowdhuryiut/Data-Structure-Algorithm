#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
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

struct Data {
	int sum;
	int lvl;

	Data(int sum, int lvl) {
		this->sum = sum;
		this->lvl = lvl;
	}

	bool operator < (const Data &d) const {
		if (sum == d.sum) {
			return lvl > d.lvl;
		}
		return sum < d.sum;
	}
};

class Solution {
public:
	int maxLevelSum(TreeNode* root) {
		queue<TreeNode*> q;
		priority_queue<Data> pq;
		q.push(root);
		int level = 1;
		while (!q.empty()) {
			int sum = 0;
			int size = q.size();
			for (int i = 0; i < size; i++)
			{
				TreeNode* curr = q.front();
				q.pop();
				sum += curr->val;
				if (curr->left != nullptr)
					q.push(curr->left);
				if (curr->right != nullptr)
					q.push(curr->right);
			}
			Data d = Data(sum, level);
			pq.push(d);
			level++;
		}
		return pq.top().lvl;
	}
};

int main()
{
    cout << "Hello World!\n";
}