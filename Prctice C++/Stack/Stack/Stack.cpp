#include <iostream>
#include <stack>

using namespace std;

int main()
{
	int n, q;
	cin >> n >> q;
	stack<int> st[n];
	while (q--) {
		int a, b, c;
		cin >> a;
		if (a == 0) {
			cin >> b >> c;
			st[b].push(c);
		}
		else if (a == 1) {
			cin >> b;
			if (!st[b].empty()) {
				cout << st[b].top() << endl;
			}
		}
		else {
			cin >> b;
			if (!st[b].empty()) {
				st[b].pop();
			}
		}
	}
}
