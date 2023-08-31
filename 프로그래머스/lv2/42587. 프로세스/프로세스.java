import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int[] prioritiesList = new int[10];
        
        for(int i = 0 ; i < priorities.length ; i++){
            prioritiesList[priorities[i]] += 1;
            queue.add(new int[]{i, priorities[i]});
        }
        
        int[] answer = new int[priorities.length];
        int order = 0;

        for(int i = 9 ; i > 0 ; i--){
            while(queue.size() > 0 && prioritiesList[i] > 0){
                int[] peek = queue.poll();

                if(peek[1] != i){
                    queue.add(peek);
                }
                else{
                    answer[peek[0]] = order;
                    order++;
                    prioritiesList[i]--;
                }
            }
        }
        
        return answer[location] + 1;
    }
}