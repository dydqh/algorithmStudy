import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int result = 0;
        for(int i = 0 ; i < d.length ; i++){
            budget -= d[i];
            result += 1;
            if(budget < 0){
                result -= 1;
                break;
            }
        }
        
        return result;
    }
}