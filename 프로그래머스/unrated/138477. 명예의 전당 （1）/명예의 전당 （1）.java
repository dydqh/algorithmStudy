import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] scoreList = new int[k];
        for(int i = 0 ; i < k ; i++){
            scoreList[i] = 2001;
        }
        int[] result = new int[score.length];
        
        for(int i = 0 ; i < score.length ; i++){
            if(i < k){
                scoreList[i] = score[i];
                Arrays.sort(scoreList);
            }
            else{
                if(scoreList[0] < score[i]){
                    scoreList[0] = score[i];
                    Arrays.sort(scoreList);
                }
            }
            result[i] = scoreList[0];
        }
        
        int[] answer = result;
        return answer;
    }
}