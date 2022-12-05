#define _CRT_SECURE_NO_WARNINGS

#include <iostream>

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
	ListNode* middleNode(ListNode* head) {
		int count = 0;
		ListNode* fast = head;
		ListNode* slow = head;
		while (fast != nullptr) {
			fast = fast->next;
			count++;
			if (count % 2 == 0) {
				slow = slow->next;
			}
		}
		return slow;
	}
};

int main()
{
    std::cout << "Hello World!\n";
}