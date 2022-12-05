#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>

using namespace std;

struct Node {
	string name;
	Node *next;
	Node *prev;
	Node(string x) : name(x), next(nullptr), prev(nullptr) {}
};

class BrowserHistory {
public:

	Node *current;

	BrowserHistory(string homepage) {
		current = new Node(homepage);
	}

	void visit(string url) {
		Node *newNode = new Node(url);
		newNode->prev = current;
		current->next = newNode;
		current = current->next;
	}

	string back(int steps) {
		while (current->prev != nullptr && steps != 0) {
			current = current->prev;
			steps--;
		}
		return current->name;
	}

	string forward(int steps) {
		while (current->next != nullptr && steps != 0) {
			current = current->next;
			steps--;
		}
		return current->name;
	}
};

int main()
{
	BrowserHistory browserHistory = BrowserHistory("leetcode.com");
	browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
	browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
	browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
	browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
	browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
	browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
	browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
	browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
	browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
	browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    cout << "Hello World!\n";
}