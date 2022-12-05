#define CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <unordered_map>
#include <string>
#include <queue>

using namespace std;

unordered_map<string, int> mp;

struct Node {
	string data;
	int count;

	Node(string data, int count) {
		this->data = data;
		this->count = count;
	}

	bool operator < (const Node &d) const {
		if (count == d.count) {
			return data > d.data;
		}
		else {
			return count < d.count;
		}
	}
};

class Solution {
public:
	vector<string> topKFrequent(vector<string>& words, int k) {
		mp.clear();
		priority_queue<Node> pq;
		vector<string> result;
		for (int i = 0; i < words.size(); i++) {
			mp[words[i]]++;
		}
		for (auto it : mp) {
			Node data = Node(it.first, it.second);
			pq.push(data);
		}
		int count = 0;
		while (!pq.empty()) {
			if (count == k) {
				break;
			}
			Node d = pq.top();
			result.push_back(d.data);
			pq.pop();
			count++;
		}
		return result;
	}
};

int main()
{
    std::cout << "Hello World!\n";
}