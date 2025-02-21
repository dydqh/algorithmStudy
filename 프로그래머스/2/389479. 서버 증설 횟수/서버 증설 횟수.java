import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        List<Queue<int[]>> queues = new ArrayList<>();
        queues.add(new LinkedList<>());
        queues.add(new LinkedList<>());
        int answer = 0;
        int curServerSize = 0;
        for(int i = 0 ; i < players.length ; i++){
            int player = players[i];
            int requiredServerSize = player / m;
            Queue<int[]> curQueue = queues.get(i % 2);
            Queue<int[]> nextQueue = queues.get((i + 1) % 2);
            if(requiredServerSize > curServerSize){
                int addServerSize = requiredServerSize - curServerSize;
                answer += addServerSize;
                if(k > 1){
                    nextQueue.add(new int[]{1, addServerSize});
                    curServerSize += addServerSize;
                }
            }
            while(curQueue.size() > 0){
                int[] curServer = curQueue.poll();
                if(curServer[0] + 1 < k){
                    nextQueue.add(new int[]{curServer[0] + 1, curServer[1]});
                }
                else{
                    curServerSize -= curServer[1];
                }
            }
        }
        return answer;
    }
}