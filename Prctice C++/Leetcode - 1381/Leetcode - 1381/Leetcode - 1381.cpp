#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <deque>

using namespace std;

class CustomStack {
public:

	int maxSize;
	deque<int> dq;

	CustomStack(int maxSize) {
		this->maxSize = maxSize;
		dq.clear();
	}

	void push(int x) {
		if (dq.size() < maxSize) {
			dq.push_front(x);
		}
	}

	int pop() {
		if (dq.empty()) {
			return -1;
		}
		else {
			int val = dq.front();
			dq.pop_front();
			return val;
		}
	}

	void increment(int k, int val) {
		if (dq.size() < k) {
			for (int i = 0; i < dq.size(); i++) {
				dq[i] += val;
			}
		}
		else {
			for (int i = dq.size() - k; i < dq.size(); i++) {
				dq[i] += val;
			}
		}
	}
};


int main()
{
    cout << "Hello World!\n";
}