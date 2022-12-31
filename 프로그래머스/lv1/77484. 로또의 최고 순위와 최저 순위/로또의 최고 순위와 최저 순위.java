import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        List<Integer> lottosList = new ArrayList<>();
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i] == 0){
                zeroCount += 1;
            }
            else{
                lottosList.add(lottos[i]);
            }
        }
        
        int scoreCount = 0;
        for(int i = 0 ; i < win_nums.length ; i++){
            if(lottosList.contains(win_nums[i])){
                scoreCount += 1;
            }
        }
        int[] answer = {7 - (scoreCount + zeroCount) > 6 ? 6 : 7 - (scoreCount + zeroCount), 7 - scoreCount > 6 ? 6 : 7 - scoreCount};
        return answer;
    }
}