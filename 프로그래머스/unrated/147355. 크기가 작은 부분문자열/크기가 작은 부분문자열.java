import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Double targetP = Double.parseDouble(p);
        
        for(int i = 0 ; i < (t.length() - p.length() + 1) ; i++){
            Double targetT = Double.parseDouble(t.substring(i, i + p.length()));

            if(targetT <= targetP){
                answer += 1;
            }
        }
        
        return answer;
    }
}