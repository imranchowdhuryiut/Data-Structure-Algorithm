#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <iostream>
#include <vector>
#include <queue>

using namespace std;

char str[30][30];
bool visited[30][30];
int eagleCount, row, col;

int dr[] = { -1,-1,-1, 0, 0, 1, 1, 1 };
int dc[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

struct node {
	int r, c;
	node(int r, int c)
	{
		this->r = r;
		this->c = c;
	}
};

bool isValid(int r, int c)
{
	if (r >= 0 && r < row && c >= 0 && c < col)
		return true;
	return false;
}

void bfs(node source)
{
	eagleCount++;

	queue<node>Q;
	Q.push(source);
	visited[source.r][source.c] = true;
	while (!Q.empty())
	{
		node v = Q.front();
		Q.pop();
		for (int i = 0; i < 8; i++)
		{
			int x = v.r + dr[i];
			int y = v.c + dc[i];
			if (isValid(x, y) && visited[x][y] == false && str[x][y] == '1')
			{
				Q.push(node(x, y));
				visited[x][y] = true;
			}
		}
	}
}

int main()
{
//	freopen("input.txt", "r", stdin);
//	freopen("output.txt", "w", stdout);

	int ks = 1;
	int i, j, n;

	while (scanf("%d", &n) == 1)
	{
		for (i = 0; i < n; i++)
		{
			scanf("%s", str[i]);
		}

		row = col = n;
		eagleCount = 0;
		memset(visited, false, sizeof visited);
		
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (visited[i][j] == false && str[i][j] == '1')
				{
					bfs(node(i, j));
				}
			}
		}

		printf("Image number %d contains %d war eagles.\n", ks++, eagleCount);
	}
	
	return 0;
}