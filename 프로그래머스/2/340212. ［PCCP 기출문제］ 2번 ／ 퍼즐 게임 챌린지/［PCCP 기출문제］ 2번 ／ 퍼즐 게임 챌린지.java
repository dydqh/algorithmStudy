import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        long min = 1;
        long max = limit;
        long mid = 0;
        
        while(min < max){
            mid = (min + max) / 2;
            long curTime = times[0];
            for(int i = 1 ; i < diffs.length ; i++){
                if(mid >= diffs[i]){
                    curTime += times[i];
                }
                else{
                    long wrongCount = diffs[i] - mid;
                    curTime += (times[i] + times[i - 1]) * wrongCount + times[i];
                }
            }
            if(curTime <= limit){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        
        return (int)min;
    }
}