class Solution {
    public int solution(int sticker[]) {
        int len = sticker.length;
        int answer = 0;
        
        if(len <= 3){
            answer = sticker[0];
            for(int i = 0 ; i < len ; i++){
                answer = Math.max(answer, sticker[i]);
            }
        }
        else{
            int[] dp = new int[len];
            int[] dp2 = new int[len];
            
            dp[0] = sticker[0];
            dp[1] = Math.max(sticker[0], sticker[1]);
            for (int i = 2; i < len - 1; i++) {
                dp[i] = Math.max(dp[i - 1] , dp[i - 2] + sticker[i]);
            }
            
            dp2[0] = 0;
            dp2[1] = sticker[1];
            for (int i = 2; i < len; i++) {
                dp2[i] = Math.max(dp2[i - 1] , dp2[i - 2] + sticker[i]);
            }
            
            answer = Math.max(dp[len - 2], dp2[len - 1]);
        }
        return answer;
    }
}