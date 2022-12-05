#include <iostream>
#include <queue>

using namespace std;

class SmallestInfiniteSet {
public:

	int arr[1001];
	int index = 0;

	SmallestInfiniteSet() {
		for (int i = 0; i < 1001; i++) {
			arr[i] = 0;
		}
	}

	void updateIndex() {
		index = 0;
		while (arr[index] != 0) {
			index = index + 1;
		}
	}

	int popSmallest() {
		arr[index] = -1;
		int temp = index + 1;
		updateIndex();
		return temp;
	}

	void addBack(int num) {
		if (arr[num - 1] == 0) {
			return;
		}
		else {
			arr[num - 1] = 0;
			updateIndex();
		}
	}
};

int main()
{
    cout << "Hello World!\n";
}