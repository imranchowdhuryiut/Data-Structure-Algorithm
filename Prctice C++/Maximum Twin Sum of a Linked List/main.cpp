#include <iostream>
#include <stack>
#include <stdio.h>
#include <limits>

using namespace std;

struct ListNode
{
	int val;
	ListNode *next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution
{
public:
	int pairSum(ListNode* head)
	{
		stack<int> st;
		ListNode* fast = head;
		ListNode* slow = head;
		int count = 0;
		while (fast != nullptr) {
			fast = fast->next;
			count++;
			if (count % 2 == 0) {
				st.push(slow->val);
				slow = slow->next;
			}
		}
		int max = INT_MIN;
		while (!st.empty() && slow != nullptr) {
			int val = st.top();
			if (slow != nullptr && (val + slow->val) > max) {
				max = val + slow->val;
			}
			st.pop();
			slow = slow->next;
		}
		return max;
	}
};

int main()
{
	Solution myobj;
	ListNode head = ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
	cout << myobj.pairSum(&head);
	return 0;
}
