#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <set>
#include <unordered_map>

using namespace std;

struct Player {
	int name;
	int win;
	int loss;
	Player() {
		name = -1;
		win = 0;
		loss = 0;
	}
};

class Solution {
public:
	vector<vector<int>> findWinners(vector<vector<int>>& matches) {
		set<int> st;
		unordered_map<int, Player> mp;
		for (int i = 0; i < matches.size(); i++) {
			for (int j = 0; j < 2; j++) {
				st.insert(matches[i][j]);
			}
		}

		for (auto it: st) {
			Player model = Player();
			model.name = it;
			mp[it] = model;
		}
		
		for (int i = 0; i < matches.size(); i++) {
			int winPlayer = matches[i][0];
			int loosePlayer = matches[i][1];
			
			mp[winPlayer].win++;
			mp[loosePlayer].loss++;
		}
		vector<vector<int>> result;
		vector<int> noLossPlayer;
		vector<int> oneLossPlayer;
		for (auto it : st) {
			if (mp[it].loss == 0) {
				noLossPlayer.push_back(it);
			}

			if (mp[it].loss == 1) {
				oneLossPlayer.push_back(it);
			}
		}
		result.push_back(noLossPlayer);
		result.push_back(oneLossPlayer);
		return result;
	} 
};

int main()
{
	vector<vector<int>> matches = { {2, 3},{1, 3},{5, 4 }, { 6, 4 }
};
	Solution myObj;
	myObj.findWinners(matches);
    cout << "Hello World!\n";
}