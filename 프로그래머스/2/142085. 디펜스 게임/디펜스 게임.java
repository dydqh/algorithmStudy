import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        Queue<Integer> pq = new PriorityQueue<>();
        int round = 0;

        for(int curEnemy : enemy){
            pq.add(curEnemy);
            n -= pq.size() > k ? pq.poll() : 0;

            if(n < 0) break;
            round++;
        }

        return round;
    }
}