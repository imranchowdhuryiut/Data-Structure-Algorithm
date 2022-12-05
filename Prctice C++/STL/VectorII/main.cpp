#include <iostream>
#include <vector>
#include <stdio.h>

using namespace std;

void print(vector<int> &ar) {
    bool isPrint = false;
    for(int i = 0; i < ar.size(); i ++) {
        isPrint = true;
        printf("%d", ar[i]);
        if(i < ar.size() - 1) {
            printf(" ");
        } else {
            printf("\n");
        }
    }
    if(!isPrint) {
        cout << endl;
    }
}

int main() {
    int n, q;
    cin >> n >> q;
    vector<int> arr[n];
    while (q--) {
        int a, b, c;
        cin >> a;
        if(a == 0) {
            cin >> b >> c;
            arr[b].push_back(c);
        } if (a == 1){
            cin >> b;
            print(arr[b]);
        } if (a == 2) {
            cin >> b;
            if (!arr[b].empty()) {
                arr[b].clear();
            }
        }
    }
    return 0;
}
