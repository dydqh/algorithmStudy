import java.util.*;

class Solution {
    int score = 0;
    int[] answer = new int[11];

    public int[] solution(int n, int[] info) {
        dfs(n, new int[11], 0, n, info);
        
        if(score == 0){
            answer = new int[]{-1};
        }
        return answer;
    }

    public void dfs(int remain, int[] curAnswer, int index, int n, int[] info){
        if(remain == 0 || index == n){
            if(remain > 0){
                curAnswer[index] = remain;
            }
            int aScore = 0;
            int lScore = 0;

            for(int i = 0 ; i < 11 ; i++){
                if(info[i] == 0 && curAnswer[i] == 0){
                    continue;
                }
                if(info[i] >= curAnswer[i]){
                    aScore += (10 - i);
                }
                else{
                    lScore += (10 - i);
                }
            }

            int curScore = lScore - aScore;

            if(curScore > score){
                score = curScore;
                answer = Arrays.copyOf(curAnswer, 11);
            }
            else if(curScore == score){
                for(int j = 10; j >= 0; j--){
                    if(answer[j] < curAnswer[j]){
                        answer = Arrays.copyOf(curAnswer, 11);
                        break;
                    }else if(answer[j] > curAnswer[j]){
                        break;
                    }
                }
            }
            curAnswer[index] = 0;
            return;
        }

        if(remain - info[index] - 1 >= 0){
            curAnswer[index] = info[index] + 1;
            dfs(remain - info[index] - 1, curAnswer, index + 1, n, info);
            curAnswer[index] = 0;
        }
        dfs(remain, curAnswer, index + 1, n, info);
    }
}