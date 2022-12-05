#ifndef _CRT_SECURE_NO_WARNINGS
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <iostream>
#include <stdio.h>
#include <unordered_map>
#include <string>

using namespace std;

#define CMD_INIT    1
#define CMD_APPEND  2
#define CMD_CUT     3
#define CMD_REVERSE 4
#define CMD_COUNT   5

extern void init(char mStr[]);
extern void appendWord(char mWord[]);
extern void cut(int k);
extern void reverse();
extern int countOccurrence(char mWord[]);

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////


unordered_map<string, int> subStringCount;
bool isReversed;
string initialString;

void appenedToFirst(char mWord[]) {

}

void appenedToLast(char mWord[]) {

}

void decreseSubstringCount(string str) {
	for (int i = 0; i < str.size(); i++) {
		createSubStringAndDeleteFromMap(str, i, 1);
		if (i + 4 < initialString.size()) {
			createSubStringAndDeleteFromMap(str, i, 4);
			createSubStringAndDeleteFromMap(str, i, 3);
			createSubStringAndDeleteFromMap(str, i, 2);
		}
		else if (i + 3 < initialString.size()) {
			createSubStringAndDeleteFromMap(str, i, 3);
			createSubStringAndDeleteFromMap(str, i, 2);
		}
		else if (i + 2 < initialString.size()) {
			createSubStringAndDeleteFromMap(str, i, 2);
		}
	}
}

void createSubStringAndAddToMap(int from, int to) {
	string temp = initialString.substr(from, to);
	subStringCount[temp]++;
}

void createSubStringAndDeleteFromMap(string str, int from, int to) {
	string temp = str.substr(from, to);
	subStringCount[temp]--;
}

void deleteFromfirst(int k) {
	string temp = initialString.substr(0, k);
	initialString.erase(0, k);
	decreseSubstringCount(temp);
}

void deleteFromLast(int k) {
	string temp = initialString.substr(initialString.size() - k, k);
	initialString.erase(initialString.size() - k, k);
	decreseSubstringCount(temp);
}

void init(char mStr[])
{
	isReversed = false;
	initialString = "";
	subStringCount.clear();
	initialString = mStr;
	for (int i = 0; i < initialString.size(); i++) {
		createSubStringAndAddToMap(i, 1);
		if (i + 4 < initialString.size()) {
			createSubStringAndAddToMap(i, 4);
			createSubStringAndAddToMap(i, 3);
			createSubStringAndAddToMap(i, 2);
		}
		else if (i + 3 < initialString.size()) {
			createSubStringAndAddToMap(i, 3);
			createSubStringAndAddToMap(i, 2);
		}
		else if (i + 2 < initialString.size()) {
			createSubStringAndAddToMap(i, 2);
		}
	}
}

void appendWord(char mWord[])
{
	if (isReversed) {
		for (int i = 0; i < sizeof(mWord) / 2; i++) {
			char temp = mWord[i];
			mWord[i] = mWord[sizeof(mWord) - 1 - i];
			mWord[sizeof(mWord) - 1 - i] = temp;
		}
		appenedToFirst(mWord);
	}
	else {
		appenedToLast(mWord);
	}
} 

void cut(int k)
{
	if (isReversed) {
		deleteFromfirst(k);
	}
	else {
		deleteFromLast(k);
	}
}

void reverse()
{
	if (isReversed) {
		isReversed = false;
	}
	else {
		isReversed = true;
	}
}

int countOccurrence(char mWord[])
{
	if (isReversed) {
		for (int i = 0; i < sizeof(mWord) / 2; i++) {
			char temp = mWord[i];
			mWord[i] = mWord[sizeof(mWord) - 1 - i];
			mWord[sizeof(mWord) - 1 - i] = temp;
		}
		return subStringCount[mWord];
	}
	else {
		return subStringCount[mWord];
	}
}


/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

static bool run()
{
	bool correct = false;
	int queryCnt;
	scanf("%d", &queryCnt);
	static char mStr[30001], mWord[5];

	while (queryCnt--)
	{
		int cmd;
		scanf("%d", &cmd);

		if (cmd == CMD_INIT)
		{
			scanf("%s", mStr);
			init(mStr);
			correct = true;
		}
		else if (cmd == CMD_APPEND)
		{
			scanf("%s", mWord);

			if (correct)
			{
				appendWord(mWord);
			}
		}
		else if (cmd == CMD_CUT)
		{
			int k;
			scanf("%d", &k);

			if (correct)
			{
				cut(k);
			}
		}
		else if (cmd == CMD_REVERSE)
		{
			if (correct)
			{
				reverse();
			}
		}
		else if (cmd == CMD_COUNT)
		{
			scanf("%s", mWord);

			int ret = -1;
			if (correct)
			{
				ret = countOccurrence(mWord);
			}

			int ans;
			scanf("%d", &ans);
			if (ret != ans)
			{
				correct = false;
			}
		}
	}
	return correct;
}

int main()
{
	setbuf(stdout, NULL);
	//freopen("sample_input.txt", "r", stdin);

	int T, MARK;
	scanf("%d %d", &T, &MARK);

	for (int tc = 1; tc <= T; tc++)
	{
		int score = run() ? MARK : 0;
		printf("#%d %d\n", tc, score);
	}
	return 0;
}