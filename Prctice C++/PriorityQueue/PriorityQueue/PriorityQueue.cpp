#include <iostream>
#include <queue>

using namespace std;

int main()
{
	int n, q;
	cin >> n >> q;
	priority_queue<int> pq[n];
	while (q--) {
		int a, b, c;
		cin >> a;
		if (a == 0) {
			cin >> b >> c;
			pq[b].push(c);
		}
		else if (a == 1) {
			cin >> b;
			if (!pq[b].empty()) {
				cout << pq[b].top() << endl;
			}
		}
		else {
			cin >> b;
			if (!pq[b].empty()) {
				pq[b].pop();
			}
		}
	}
}