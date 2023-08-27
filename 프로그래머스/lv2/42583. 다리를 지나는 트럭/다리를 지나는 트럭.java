import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 1;
        int index = 0;
        int curWeight = 0;

        while(index < truck_weights.length){
            if(queue.size() >= bridge_length){
                curWeight -= queue.poll();
            }

            if(curWeight + truck_weights[index] <= weight){
                queue.add(truck_weights[index]);
                curWeight += truck_weights[index];
                index++;
                time++;
            }
            else{
                queue.add(0);
                time++;
            }
        }

        time += (bridge_length - 1);

        return time;
    }
}