#include <iostream>
#include <stdio.h>
#include <queue>

using namespace std;

int main() {
	int n, query;
	cin >> n >> query;
	queue<int> q[n];
	while (query--) {
		int a, b, c;
		cin >> a;
		if (a == 0) {
			cin >> b >> c;
			q[b].push(c);
		}
		else if (a == 1)
		{
			cin >> b;
			if (!q[b].empty())
			{
				cout << q[b].front() << endl;
			}
		}
		else {
			cin >> b;
			if (!q[b].empty())
			{
				q[b].pop();
			}
		}
	}
	return 0;
}