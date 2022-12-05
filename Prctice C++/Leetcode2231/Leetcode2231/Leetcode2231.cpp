#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class Solution {
public:
	int largestInteger(int num) {
		priority_queue<int> even;
		priority_queue<int> odd;
		vector<int> array;
		while (num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				array.push_back(2);
				even.push(digit);
			}
			else {
				array.push_back(1);
				odd.push(digit);
			}
			num = num / 10;
		}
		int digit = 0;
		for (int i = array.size() - 1; i >= 0; i--) {
			int num;
			if (array[i] == 1) {
				num = odd.top();
				odd.pop();
			}
			else {
				num = even.top();
				even.pop();
			}
			digit = digit * 10 + num;
		}
		return digit;
	}
};

int main()
{
	Solution mySolution;
	cout << mySolution.largestInteger(1234)<<endl;
}