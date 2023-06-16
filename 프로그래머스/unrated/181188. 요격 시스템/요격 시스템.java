import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0 ; i < targets.length ; i++){
            list.add(targets[i]);
        }

        Collections.sort(list, (next, pre) -> {
            if(next[0] == pre[0]){
                if(next[1] == pre[1]){
                    return next[1] - pre[1];
                }
                else{
                    return 0;
                }
            }
            else{
                return next[0] - pre[0];
            }
        });

        int count = 1;
        int[] data = list.get(0);
        int start = data[0];
        int end = data[1];

        for(int i = 1 ; i < list.size() ; i++){
            int[] curData = list.get(i);
            int curStart = curData[0];
            int curEnd = curData[1];

            if(curStart >= end){
                count++;
                start = curStart;
                end = curEnd;
            }
            else{
                start = curStart >= start ? curStart : start;
                end = curEnd >= end ? end : curEnd;
            }
        }
        
        return count;
    }
}