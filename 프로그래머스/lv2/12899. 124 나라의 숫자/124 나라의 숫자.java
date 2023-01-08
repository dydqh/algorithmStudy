import java.util.*;

class Solution {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        
        int target = n;
        while(target > 0){
            if(target % 3 == 0){
                stack.add(4);
                target -= 3;
                target /= 3;
            }
            else{
                stack.add(target % 3);
                target /= 3;
            }
        }
        
        while(stack.size() > 0){
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}