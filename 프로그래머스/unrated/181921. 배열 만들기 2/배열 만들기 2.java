import java.util.*;
import java.util.stream.IntStream;

class Solution { 
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r).filter(
            number -> {
                boolean isTarget = true;
                while(number > 0){
                    int remain = number % 10;
                    if(remain != 0 && remain != 5){
                        isTarget = false;
                        break;
                    }
                    number /= 10;
                }
                return isTarget;
            }
        ).toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}