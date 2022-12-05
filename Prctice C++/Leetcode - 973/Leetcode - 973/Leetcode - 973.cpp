#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <queue>

using namespace std;

struct Data
{
	int x;
	int y;
	double distance;

	Data(int x, int y, double distance) {
		this->x = x;
		this->y = y;
		this->distance = distance;
	}

	bool operator < (const Data &d) const {
		return distance > d.distance;
	}
};

class Solution {
public:
	vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
		priority_queue<Data> pq;
		vector<vector<int>> result;
		for (int i = 0; i < points.size(); i++) {
			int x = points[i][0];
			int y = points[i][1];
			double distance = sqrt(x * x + y * y);
			Data d = Data(x, y, distance);
			pq.push(d);
		}
		int count = 0;
		while (!pq.empty()) {
			Data d = pq.top();
			pq.pop();
			vector<int> vc;
			vc.push_back(d.x);
			vc.push_back(d.y);
			result.push_back(vc);
			count++;
			if (count == k) {
				break;
			}
		}
		return result;
	}
};

int main()
{
    cout << "Hello World!\n";
}