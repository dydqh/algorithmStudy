import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for(int i = 0 ; i < prices.length ; i++){
            if(stack.size() == 0){
                stack.push(i);
            }
            else{
                if(prices[stack.peek()] > prices[i]){
                    while(stack.size() > 0 && prices[stack.peek()] > prices[i]){
                        int curIndex = stack.pop();
                        answer[curIndex] = (i - curIndex);
                    }
                    stack.push(i);
                }
                else{
                    stack.push(i);
                }
            }
        }

        int time = 0;
        for(int i = prices.length - 1 ; i >= 0 ; i--){
            if(answer[i] == 0){
                answer[i] = time;
            }
            time++;
        }

        return answer;
    }
}