#include <bits/stdc++.h>
using namespace std;

class Solution {
    public:
    double myPow(double x, int n) {

        long long exp = n;
        if (exp < 0) {
            x = 1.0 / x;
            exp = -exp;
        }

        double ans = 1.0;
        while (exp) {
            if (exp & 1LL) ans *= x;
            x *= x;
            exp >>= 1LL;
        }
        return ans;
    }
};