import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int lastCount = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < ingredient.length ; i++){
            stack.add(ingredient[i]);
            
            if(stack.size() > 0 && stack.peek() == 1){
                stack.pop();
                if(stack.size() > 0 && stack.peek() == 3){
                    stack.pop();
                    if(stack.size() > 0 && stack.peek() == 2){
                        stack.pop();
                        if(stack.size() > 0 && stack.peek() == 1){
                            stack.pop();
                            answer += 1;
                        }
                        else{
                            stack.add(2);
                            stack.add(3);
                            stack.add(1);
                        }
                    }
                    else{
                        stack.add(3);
                        stack.add(1);
                    }
                }
                else{
                    stack.add(1);
                }
            }
        }
        
        return answer;
    }
}