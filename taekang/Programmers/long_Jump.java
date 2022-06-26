class Solution {
    public long solution(int n) {
        // 한번에 1칸, 또는 2칸
        // n = 1 일때, (1) 1개
        // n = 2 일때, (1,1) (2) 2개
        // n = 3 일때, 3개
        // n = 4 일때, 5개
        // n = 5 일때, (11111) (1112) (1121) (1211) (211)
        // (122) (212) (221), 9개
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <=n ;i++){
            dp[i] += (dp[i-2] + dp[i-1]) % 1234567;
        }


        return dp[n];
    }
}