class Solution {
    public int fib(int n) {
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = 1;

        if(n <= 1) return n;
        for(int i = 2; i <= n; i++)
        {
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return dp[2];
    }
}