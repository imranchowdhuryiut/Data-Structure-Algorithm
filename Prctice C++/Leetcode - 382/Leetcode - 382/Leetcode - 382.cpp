#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>

using namespace std;

struct ListNode {
	int val;
	ListNode *next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:

	vector<int> vc;

	Solution(ListNode* head) {
		vc.clear();
		while (head != nullptr)
		{
			vc.push_back(head->val);
			head = head->next;
		}

	}

	int getRandom() {
		int size = vc.size();
		if (size > 1) {
			return vc[rand() % size];
		}
		return vc[0];
	}
};

int main()
{
    cout << "Hello World!\n";
}