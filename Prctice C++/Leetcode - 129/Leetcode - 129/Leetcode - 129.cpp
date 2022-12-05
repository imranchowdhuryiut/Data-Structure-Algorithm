#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
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

vector<int> numbers;

void findNumbers(TreeNode* root, int val) {
	if (root == nullptr) {
		return;
	}

	int rootVal = root->val;
	int number = val * 10 + rootVal;

	if (root->left == nullptr && root->right == nullptr) {
		numbers.push_back(number);
		return;
	}
	else {
		findNumbers(root->left, number);
		findNumbers(root->right, number);
	}
}

class Solution {
public:
	int sumNumbers(TreeNode* root) {
		numbers.clear();
		findNumbers(root, 0);
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers[i];
		}
		return sum;
	}
};

int main()
{
    cout << "Hello World!\n";
}