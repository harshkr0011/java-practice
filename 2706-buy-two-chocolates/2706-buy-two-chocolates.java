class Solution {
    public int buyChoco(int[] prices, int money) {
        int left=0, right=prices.length-1;
        int firstMin=prices[left], secondMin=prices[right];
        while (left < right) {
            if (firstMin > prices[left]) firstMin = prices[left];
            if (secondMin > prices[right]) secondMin = prices[right];
            if (prices[left] > prices[right]) {
                left++;
            } else {
                right--;
            }
        }
        int totalCost = firstMin + secondMin;
        if (money >= totalCost) return money - totalCost;
        return money;
    }
}



