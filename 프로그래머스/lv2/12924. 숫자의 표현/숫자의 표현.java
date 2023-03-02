class Solution {
    public static int answer = 0;
    
    public int solution(int n) {
        for(int i = 1 ; i <= n ; i++){
            cal(n, i);
        }
        
        return answer;
    }
    
    public static void cal(int n, int start){
        int sum = 0;
        
        while(sum < n){
            sum += start;
            start++;
        }
        
        if(sum == n){
            answer++;
        }
    }
}