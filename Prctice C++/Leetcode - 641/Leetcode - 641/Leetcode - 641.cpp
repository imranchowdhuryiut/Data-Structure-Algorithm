#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <deque>

using namespace std;

class MyCircularDeque {
public:

	deque<int> dq;
	int currentSize;
	int maxSize;

	MyCircularDeque(int k) {
		dq.clear();
		currentSize = 0;
		maxSize = k;
	}

	bool insertFront(int value) {
		bool isInsert = false;
		if (currentSize < maxSize) {
			dq.push_front(value);
			currentSize++;
			isInsert = true;
		}
		return isInsert;
	}

	bool insertLast(int value) {
		bool isInsert = false;
		if (currentSize < maxSize) {
			dq.push_back(value);
			currentSize++;
			isInsert = true;
		}
		return isInsert;
	}

	bool deleteFront() {
		bool isDelete = false;
		if (currentSize != 0) {
			dq.pop_front();
			isDelete = true;
			currentSize--;
		}
		return isDelete;
	}

	bool deleteLast() {
		bool isDelete = false;
		if (currentSize != 0) {
			dq.pop_back();
			isDelete = true;
			currentSize--;
		}
		return isDelete;
	}

	int getFront() {
		if (currentSize == 0) {
			return -1;
		}
		else {
			return dq.front();
		}
	}

	int getRear() {
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
    std::cout << "Hello World!\n";
}