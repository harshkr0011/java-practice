#include <bits/stdc++.h>
using namespace std;

class Solution {
    public:
    string countAndSay(int n) {
        string cur = "1";
        for (int i = 1; i < n; ++i) {
            string nxt;
            for (size_t j = 0; j < cur.size(); ) {
                char ch = cur[j];
                size_t k = j;
                while (k < cur.size() && cur[k] == ch) ++k;
                int cnt = static_cast<int>(k - j);
                nxt += to_string(cnt);
                nxt += ch;
                j = k;
            }
            cur.swap(nxt);
        }
        return cur;
    }
};