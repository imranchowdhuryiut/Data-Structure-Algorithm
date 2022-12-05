#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
	double a, b;
	while (scanf("%lf%lf", &a, &b) == 2) {
		printf("%.0lf\n", abs(b - a));
	}
	return 0;
}
