class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        String newS = s.strip().toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = newS.length() - 1;
        while (left <= right) {
            if (newS.charAt(left) != newS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}