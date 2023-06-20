class Solution {
    public int solution(int n) {
        if(n % 2 == 1){
            return 0;
        }
        else{
            return tiling(n / 2);
        }
    }
    
    public static int tiling(int n){
        long[] dp = new long[n + 2];

        dp[1] = 3;
        dp[2] = 11;
        
        for(int i = 3 ; i <= n ; i++){
            dp[i] = (dp[i - 1] * 4 - dp[i - 2]) % 1000000007;
            if(dp[i] < 0){
                dp[i] += 1000000007;
            }
        }

        return (int)dp[n];
    }
}