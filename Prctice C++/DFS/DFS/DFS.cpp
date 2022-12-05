#include<iostream>
#include<vector>

using namespace std;
vector<int> node[100];
int vis[100];
bool dfs(int source) {

	for (int i = 0; i < node[source].size(); i++) {
		int child = node[source][i];
		if (vis[child] && child != source) {
			return true;
		}
		if (!vis[child] ) {
			vis[child] = 1;
			dfs(child);
		}
			
	}
	return false;
}
int main()
{
	int n;
	cin >> n;
	int a, b;
	memset(vis, 0, sizeof(vis));
	for (int i = 0; i < n; i++) {
		cin >> a >> b;
		node[a].push_back(b);
		node[b].push_back(a);
	}
	for (int i = 1; i <= n; i++) {
		if(!vis[i])
			dfs(i);
	}
}