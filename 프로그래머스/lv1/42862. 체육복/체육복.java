class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] count = new int[n + 2];
        
        for(int i = 1 ; i < count.length - 1 ; i++){
            count[i] = 1;
        }
        
        for(int i = 0 ; i < reserve.length ; i++){
            count[reserve[i]] += 1;
        }
        
        for(int i = 0 ; i < lost.length ; i++){
            count[lost[i]] -= 1;
        }
        
        int result = 0;
        for(int i = 1 ; i <= n ; i++){
            if(count[i] == 0 && count[i - 1] == 2){
                count[i] += 1;
                count[i - 1] -= 1;
            }
            else if(count[i] == 0 && count[i + 1] == 2){
                count[i] += 1;
                count[i + 1] -= 1;
            }
            if(count[i] > 0){
                result += 1;
            }
        }
        
        return result;
    }
}