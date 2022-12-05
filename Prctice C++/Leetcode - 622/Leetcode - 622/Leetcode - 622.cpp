#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <deque>

using namespace std;

class MyCircularQueue {
public:

	deque<int> dq;
	int currentSize;
	int maxSize;

	MyCircularQueue(int k) {
		dq.clear();
		currentSize = 0;
		maxSize = k;
	}

	bool enQueue(int value) {
		bool isEnqueue = false;
		if (currentSize < maxSize) {
			dq.push_back(value);
			currentSize++;
			isEnqueue = true;
		}
		return isEnqueue;
	}

	bool deQueue() {
		bool isDequeue = false;
		if (currentSize != 0) {
			dq.pop_front();
			currentSize--;
			isDequeue = true;
		}
		return isDequeue;
	}

	int Front() {
		if (currentSize == 0) {
			return -1;
		}
		else {
			return dq.front();
		}
	}

	int Rear() {
		if (currentSize == 0) {
			return -1;
		}
		else {
			return dq.back();
		}
	}

	bool isEmpty() {
		return currentSize == 0;
	}

	bool isFull() {
		return currentSize == maxSize;
	}
};

int main()
{
    cout << "Hello World!\n";
}