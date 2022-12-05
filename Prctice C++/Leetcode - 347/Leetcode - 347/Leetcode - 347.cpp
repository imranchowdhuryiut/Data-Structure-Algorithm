#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <unordered_map>
#include <queue>

using namespace std;

struct Data {
	int num;
	int count;

	Data(int n, int occ) {
		this->num = n;
		this->count = occ;
	}

	bool operator < (const Data &d) const {
		return count < d.count;
	}
};

class Solution {
public:
	vector<int> topKFrequent(vector<int>& nums, int k) {
		unordered_map<int, int> mp;
		priority_queue<Data> pq;
		for (int i = 0; i < nums.size(); i++) {
			mp[nums[i]]++;
		}
		for (auto it : mp) {
			Data d = Data(it.first, it.second);
			pq.push(d);
		}
		int count = 0;
		vector<int> vc;
		while (count != k) {
			Data d = pq.top();
			pq.pop();
			vc.push_back(d.num);
			count++;
		}
		return vc;
	}
};

int main()
{
    cout << "Hello World!\n";
}
