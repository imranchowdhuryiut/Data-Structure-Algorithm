#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class Solution {
public:
	int lastStoneWeight(vector<int>& stones) {
		priority_queue<int> pq;
		int leftStones = 0;
		for (int i = 0; i < stones.size(); i++) {
			pq.push(stones[i]);
		}
		while (pq.size() != 1 && pq.size() != 0) {
			int a = pq.top();
			pq.pop();
			int b = pq.top();
			pq.pop();
			int remaining = abs(a - b);
			if (remaining == 0) {
				continue;
			}
			else {
				pq.push(remaining);
			}
		}
		if (!pq.empty()) {
			leftStones = pq.top();
		}
		return leftStones;
	}
};

int main()
{
	Solution mySolution;
	vector<int> stones = { 2, 2 };
    cout << mySolution.lastStoneWeight(stones) << endl;
}