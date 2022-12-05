#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

vector<int> arr[500];
int isVisited[500];
int parent[500];

void doDFS(TreeNode* root) {
	if (root == nullptr) {
		return;
	}

	if (root->left != nullptr) {
		arr[root->val].push_back(root->left->val);
		arr[root->left->val].push_back(root->val);
	}

	if (root->right != nullptr) {
		arr[root->val].push_back(root->right->val);
		arr[root->right->val].push_back(root->val);
	}

	doDFS(root->left);
	doDFS(root->right);
}

void findNodesWithKDistance(int startVertex, vector<int> &result, int distance) {
	if (distance == 0) {
		result.push_back(startVertex);
		return;
	}
	else {
		queue<int> Q;
		Q.push(startVertex);
		int level = 0;
		while (!Q.empty()) {
			int vertex = Q.front();
			Q.pop();
			isVisited[vertex] = true;
			if (!arr[vertex].empty()) {
				for (int i = 0; i < arr[vertex].size(); i++) {
					if (isVisited[arr[vertex][i]] == false) {
						parent[arr[vertex][i]] = parent[vertex] + 1;
						if (parent[arr[vertex][i]] == distance) {
							result.push_back(arr[vertex][i]);
						}
						Q.push(arr[vertex][i]);
					}
				}
			}
		}
	}
}

class Solution {
public:
	vector<int> distanceK(TreeNode* root, TreeNode* target, int k) {
		vector<int> result;
		memset(arr, {}, sizeof(arr));
		memset(isVisited, false, sizeof(isVisited));
		memset(parent, 0, sizeof(parent));
		doDFS(root);
		findNodesWithKDistance(target->val, result, k);
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
}