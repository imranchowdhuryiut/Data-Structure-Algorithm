#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <vector>
#include <stdio.h>

using namespace std;

void generateAllPaths(vector<vector<int>>& result, vector<int>& path, int position, vector<vector<int>>& graph) {
	if (graph[position].empty()) {
		if (path.size() >= 2) {
			if (path[path.size() - 1] == graph.size() - 1) {
				result.push_back(path);
				return;
			}
		}
	}
	else {
		if (path.size() >= 2) {
			if (path[path.size() - 1] == graph.size() - 1) {
				result.push_back(path);
				return;
			}
		}
	}
	for (int i = 0; i < graph[position].size(); i++) {
		path.push_back(graph[position][i]);
		generateAllPaths(result, path, graph[position][i], graph);
		path.pop_back();
	}
}

class Solution {
public:
	vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
		vector<vector<int>> result;
		vector<int> path;
		path.push_back(0);
		generateAllPaths(result, path, 0, graph);
		return result;
	}
};

int main()
{
	Solution myObj;

	return 0;
}
