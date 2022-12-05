#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <deque>
#include <stdio.h>

using namespace std;

int main()
{
	deque<int> dq;
	int t;
	scanf("%d", &t);
	while (t--) {
		int a, b, c;
		scanf("%d", &a);
		if (a == 0) {
			scanf("%d %d", &b, &c);
			if (b == 0) {
				dq.push_front(c);
			}
			else {
				dq.push_back(c);
			}
		} else if (a == 1) {
			scanf("%d", &b);
			printf("%d\n", dq[b]);
		}
		else {
			scanf("%d", &b);
			if (b == 0) {
				dq.pop_front();
			}
			else {
				dq.pop_back();
			}
		}
	}
	return 0;
}