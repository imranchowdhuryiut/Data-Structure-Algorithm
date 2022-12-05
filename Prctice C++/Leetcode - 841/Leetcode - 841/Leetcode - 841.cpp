#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <queue>

using namespace std;

bool arr[1001];

class Solution {
public:
	bool canVisitAllRooms(vector<vector<int>>& rooms) {
		queue<int> Q;
		memset(arr, false, sizeof(arr));
		Q.push(0);
		while (!Q.empty())
		{
			int room = Q.front();
			arr[room] = true;
			Q.pop();
			vector<int> keys = rooms[room];
			if (!keys.empty()) {
				for (int i = 0; i < keys.size(); i++) {
					if (arr[keys[i]] == false) {
						Q.push(keys[i]);
					}
				}
			}
		}
		bool canVisitAllRooms = true;
		for (int i = 0; i < rooms.size(); i++) {
			if (arr[i] == false) {
				canVisitAllRooms = false;
			}
		}
		return canVisitAllRooms;
	}
};

int main()
{
	Solution myObj;
	vector<vector<int>> rooms ={{1}, { 2 }, { 3 }, {}};

    cout << myObj.canVisitAllRooms(rooms)<< endl;
}