#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
	int t;
	scanf("%d", &t);
	for (int i = 1; i <= t; i++) {
		int a, b;
		scanf("%d%d", &a, &b);
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		printf("Case %d: %d\n", i, sum);
	}
}