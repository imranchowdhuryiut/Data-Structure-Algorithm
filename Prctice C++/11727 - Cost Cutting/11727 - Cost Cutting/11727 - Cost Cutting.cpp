#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int t;
	scanf("%d", &t);
	vector<int> vc;
	for (int i = 1; i <= t; i++) {
		vc.clear();
		int a, b, c;
		scanf("%d%d%d", &a, &b, &c);
		vc.push_back(a);
		vc.push_back(b);
		vc.push_back(c);
		sort(vc.begin(), vc.end());
		printf("Case %d: %d\n", i, vc[1]);
	}
	return 0;
}