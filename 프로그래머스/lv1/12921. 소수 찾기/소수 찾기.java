import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2 ; i <= n ; i++){
            if(!isPrime[i]){
                continue;
            }
            answer++;
            int target = i;
            int index = 2;
            
            while(target * index <= n){
                isPrime[target * index] = false;
                index++;
            }
        }
        
        return answer;
    }
}