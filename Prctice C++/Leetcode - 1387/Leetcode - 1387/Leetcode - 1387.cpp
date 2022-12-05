#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>

#define pa pair<int, int>

using namespace std;

class Solution {
public:
	int getKth(int lo, int hi, int k) {
		vector<pa> vc;
		for (int i = lo; i <= hi; i++) {
			int count = 0;
			int n = i;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
				}
				else {
					n = (3 * n) + 1;
				}
				count++;
			}
			pa temp = pa(count, i);
			vc.push_back(temp);
		}
		sort(vc.begin(), vc.end());
		
		return vc[k-1].second;
	}
};

int main()
{
	Solution myObj;
    cout << myObj.getKth(7, 11, 4)<< endl;
	return 0;
}