import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < progresses.length ; i++){
            queue.add(progresses[i]);
        }
        
        int day = 1;
        int index = 0;
        int result = 0;
        
        while(queue.size() > 0){
            if(queue.peek() + speeds[index] * day >= 100){
                result += 1;
                index += 1;
                queue.poll();
            }
            else{
                if(result > 0){
                    list.add(result);
                }
                result = 0;
                day++;
            }
        }
        
        if(result > 0){
            list.add(result);
        }
        
        return list;
    }
}