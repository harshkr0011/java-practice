import java.math.BigInteger;

class Solution {
    public int climbStairs(int n) {
        return fibonacci(new BigInteger(String.valueOf(n + 1))).intValue();
    }
    
    public static BigInteger fibonacci(BigInteger num) {
        if (num.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        if (num.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }

        if (num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        BigInteger a = BigInteger.ZERO;  // F(0)
        BigInteger b = BigInteger.ONE;   // F(1)

        for (BigInteger i = BigInteger.TWO; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }

        return b;
    }
}