#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class RandomizedSet {
public:

	unordered_map<int, bool> mp;
	unordered_map<int, int> mpPosition;
	vector<int> vc;

	RandomizedSet() {
		mp.clear();
		mpPosition.clear();
		vc.clear();
	}

	bool insert(int val) {
		if (mp[val] == false) {
			mp[val] = true;
			vc.push_back(val);
			int size = vc.size();
			mpPosition[val] = size - 1;
			return true;
		}
		return false;
	}

	bool remove(int val) {
		if (mp[val] == true) {
			mp[val] = false;
			int position = mpPosition[val];
			vc.erase(vc.begin() + position);
			for (int i = position; i < vc.size(); i++) {
				mpPosition[vc[i]] = i;
			}
			return true;
		}
		return false;
	}

	int getRandom() {
		int size = vc.size();
		int number = rand() % size;
		return vc[number];
	}
};

int main()
{
	RandomizedSet randomizedSet = RandomizedSet();
	randomizedSet.insert(0); 
	randomizedSet.insert(1);
	randomizedSet.remove(0);
	randomizedSet.insert(2);
	randomizedSet.remove(1); 
	randomizedSet.getRandom();
    cout << "Hello World!\n";
}