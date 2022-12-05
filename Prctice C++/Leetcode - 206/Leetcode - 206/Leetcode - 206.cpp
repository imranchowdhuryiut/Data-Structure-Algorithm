#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>

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
	ListNode* reverseList(ListNode* head) {
		ListNode* dummy = nullptr;
		if (head == nullptr) {
			return dummy;
		}
		dummy = new ListNode(head->val);
		head = head->next;
		while (head != nullptr) 
		{
			ListNode* temp = new ListNode(head->val);
			temp->next = dummy;
			dummy = temp;
			head = head->next;
		}
		return dummy;
	}
};

int main()
{
    cout << "Hello World!\n";
}