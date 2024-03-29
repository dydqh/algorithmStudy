import java.util.*;

class Solution {
        public String solution(String number, int k) {
            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            for(int i = 0 ; i < number.length() ; i++){
                int cur = Integer.parseInt(number.substring(i, i + 1));
                if(k > 0){
                    while(!stack.isEmpty() && stack.peek() < cur && k > 0){
                        stack.pop();
                        k--;
                    }
                }
                stack.push(cur);
            }
            while(k > 0){
                stack.pop();
                k--;
            }
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }