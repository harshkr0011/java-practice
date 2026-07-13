class Solution {
    private Boolean dp[][][][];
    private char[] ch1, ch2;
    private boolean isScramble(int st1, int en1, int st2, int en2){
        if(dp[st1][en1][st2][en2] != null) return dp[st1][en1][st2][en2];

        if(st1 == en1 && ch1[st1] == ch2[st2]) 
            return dp[st1][en1][st2][en2] = true;

        for(int i=st1, j=en2, map[]=new int[26], diff=0; i<en1; i++, j--){
            diff += ++map[ch1[i] - 'a'] > 0 ? 1 : -1;
            diff += --map[ch2[j] - 'a'] < 0 ? 1 : -1;

            if(diff == 0 
                    && isScramble(st1, i, j, en2)
                    && isScramble(i+1, en1, st2, j-1))   
                return dp[st1][en1][st2][en2] = true;
        }

        for(int i=st1, j=st2, map[]=new int[26], diff=0; i<en1; i++, j++){
            diff += ++map[ch1[i] - 'a'] > 0 ? 1 : -1;
            diff += --map[ch2[j] - 'a'] < 0 ? 1 : -1;

            if(diff == 0 
                    && isScramble(st1, i, st2, j)
                    && isScramble(i+1, en1, j+1, en2))   
                return dp[st1][en1][st2][en2] = true;
        }

        return dp[st1][en1][st2][en2] = false;
    }
    public boolean isScramble(String s1, String s2) {
        ch1 = s1.toCharArray(); ch2 = s2.toCharArray();
        int n = ch1.length;
        dp = new Boolean[n][n][n][n];
        return isScramble(0, n-1, 0, n-1);
    }
}