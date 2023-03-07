import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long queue1Sum = 0;
        long queue2Sum = 0;
        
        for(int i = 0 ; i < queue1.length ; i++){
            q1.add(queue1[i]);
            queue1Sum += queue1[i];
        }
        for(int i = 0 ; i < queue2.length ; i++){
            q2.add(queue2[i]);
            queue2Sum += queue2[i];
        }
        
        int answer = 0;
        
        while(queue1Sum != queue2Sum){
            if(queue1Sum > queue2Sum){
                int target = q1.poll();
                queue1Sum -= target;
                q2.add(target);
                queue2Sum += target;
            }
            else{
                int target = q2.poll();
                queue2Sum -= target;
                q1.add(target);
                queue1Sum += target;
            }
            answer++;
            if(answer > (600000)){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}