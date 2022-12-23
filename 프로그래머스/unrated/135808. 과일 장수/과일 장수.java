import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int scoreCount = score.length;
        int boxCount = scoreCount / m;
        Arrays.sort(score);
        
        if(boxCount == 0){
            return 0;
        }
        else{
            for(int i = 0 ; i < boxCount ; i++){
                int index = (scoreCount - m) - i * m;
                answer += score[index] * m;
            }
            
            return answer;
        }
    }
}