import java.util.*;

class Solution {
        public int solution(int[] order) {
            int answer = 0;
            Queue<Integer> main = new LinkedList<>();
            Stack<Integer> sub = new Stack<>();
            
            for(int i = 1 ; i <= order.length ; i++){
                main.add(i);
            }
            int index = 0;
            
            while(!main.isEmpty()){
                if (main.peek() == order[index]) {
                    answer++;
                    main.poll();
                    index++;
                }
                else if(!sub.isEmpty() && sub.peek() == order[index]){
                    sub.pop();
                    answer++;
                    index++;
                }
                else{
                    sub.push(main.poll());
                }
            }
            
            while(!sub.isEmpty() && sub.pop() == order[index]){
                answer++;
                index++;
            }
            
            return answer;
        }
    }