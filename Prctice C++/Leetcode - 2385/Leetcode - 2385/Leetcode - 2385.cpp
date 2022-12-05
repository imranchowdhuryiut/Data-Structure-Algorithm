#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <unordered_map>
#include <queue>;
#include <vector>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode() : val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

unordered_map<int, vector<int>> mp;
int arr[100001];
bool isVisited[100001];

void doDFS(TreeNode* root) {
	if (root == nullptr) {
		return;
	}

	if (root->left != nullptr) {
		mp[root->val].push_back(root->left->val);
		mp[root->left->val].push_back(root->val);
	}
	
	if (root->right != nullptr) {
		mp[root->val].push_back(root->right->val);
		mp[root->right->val].push_back(root->val);
	}

	doDFS(root->left);
	doDFS(root->right);
}

class Solution {
public:
	int amountOfTime(TreeNode* root, int start) {
		mp.clear();
		queue<int> Q;
		memset(arr, 0, sizeof(arr));
		memset(isVisited, false, sizeof(isVisited));
		doDFS(root);
		int maxTime = 0;
		Q.push(start);
		while (!Q.empty()) {
			int parent = Q.front();
			isVisited[parent] = true;
			Q.pop();
			for (int i = 0; i < mp[parent].size(); i++) {
				int child = mp[parent][i];
				if (isVisited[child] == false) {
					arr[child] = arr[parent] + 1;
					if (arr[child] > maxTime) {
						maxTime = arr[child];
					}
					Q.push(child);
				}
			}
		}
		return maxTime;
	}
};

int main()
{
    cout << "Hello World!\n";
}