import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        List<Queue<Integer>> queues = new ArrayList<>();
        queues.add(new LinkedList<>());
        queues.add(new LinkedList<>());
        int answer = 0;
        for(int i = 0 ; i < players.length ; i++){
            int player = players[i];
            int requiredServer = player / m;
            Queue<Integer> curQueue = queues.get(i % 2);
            Queue<Integer> nextQueue = queues.get((i + 1) % 2);
            int curServer = curQueue.size();
            if(requiredServer > curServer){
                int addServer = requiredServer - curServer;
                answer += addServer;
                if(k > 1){
                    for(int j = 0 ; j < addServer ; j++){
                        nextQueue.add(1);
                    }
                }
            }
            while(curQueue.size() > 0){
                int serverUsingTime = curQueue.poll() + 1;
                if(serverUsingTime < k){
                    nextQueue.add(serverUsingTime);
                }
            }
        }
        return answer;
    }
}