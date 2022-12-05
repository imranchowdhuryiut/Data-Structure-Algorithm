#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

string gen_random(const int len) {
	static const char alphanum[] =
		"0123456789"
		"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		"abcdefghijklmnopqrstuvwxyz";
	string tmp_s;
	tmp_s.reserve(len);

	for (int i = 0; i < len; ++i) {
		tmp_s += alphanum[rand() % (sizeof(alphanum) - 1)];
	}

	return tmp_s;
}

class Solution {
public:

	unordered_map<string, string> mpUrl;
	unordered_map<string, string> mpTinyUrl;
	int length = 6;
	string tinyUrlTemplate = "http://tinyurl.com/";

	Solution() {
		mpUrl.clear();
		mpTinyUrl.clear();
	}

	string encode(string longUrl) {
		string randomLengthString = gen_random(length);
		string shortUrl = tinyUrlTemplate + randomLengthString;
		mpUrl[longUrl] = shortUrl;
		mpTinyUrl[shortUrl] = longUrl;
		return shortUrl;
	}

	string decode(string shortUrl) {
		return mpTinyUrl[shortUrl];
	}
};

int main()
{
    cout << "Hello World!\n";
}