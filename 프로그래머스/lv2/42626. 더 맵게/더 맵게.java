import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i = 0 ; i < scoville.length ; i++){
            pq.add((long)scoville[i]);
        }
        
        int result = 0;

        while(pq.size() > 1 && pq.peek() < K){
            result++;
            long first = pq.poll();
            long second = pq.poll();
            long newScoville = first + (second * 2);
            pq.add(newScoville);
        }

        return pq.size() == 1 && pq.peek() < K ? -1 : result;
    }
}