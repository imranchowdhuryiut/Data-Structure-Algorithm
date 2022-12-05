#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>
#include <stack>

using namespace std;

class Solution {
public:
	string removeStars(string s) {
		stack<char> st;
		for (int i = 0; i < s.size(); i++) {
			if (s[i] >= 97 && s[i] <= 122) {
				st.push(s[i]);
			}
			else {
				st.pop();
			}
		}
		string result = "";
		if (st.empty()) {
			return result;
		}
		else {
			while (!st.empty()) {
				result += st.top();
				st.pop();
			}
			reverse(result.begin(), result.end());
			return result;
		}
	}
};

int main()
{
	Solution myObj;
    cout << myObj.removeStars("leet**cod*e");
	return 0;
}