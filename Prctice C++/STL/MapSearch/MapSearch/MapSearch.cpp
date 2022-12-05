#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <map>
#include <stdio.h>
#include <string>

using namespace std;

int main()
{
	int t;
	map<string, int> mp;
	scanf("%d", &t);
	while (t--) {
		int a, b;
		string key;
		scanf("%d", &a);
		if (a == 0) {
			cin >> key;
			scanf("%d", &b);
			mp[key] = b;
		}
		else {
			cin >> key;
			printf("%d\n", mp[key]);
		}
	}
	return 0;
}