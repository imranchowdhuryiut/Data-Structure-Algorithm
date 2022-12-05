#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <limits.h>
#include <stdio.h>

using namespace std;

int main()
{
	int a, b, x, y;
	while (scanf("%d %d", &a, &b) == 2) {
		if (a > b) {
			x = b;
			y = a;
		}
		else {
			x = a;
			y = b;
		}
		int max = INT_MIN;
		for (int i = x; i <= y; i++) {
			int steps = 1;
			int n = i;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
				}
				else {
					n = (3 * n) + 1;
				}
				steps++;
			}
			if (steps > max) {
				max = steps;
			}
		}
		printf("%d %d %d\n", a, b, max);
	}
	return 0;
}
