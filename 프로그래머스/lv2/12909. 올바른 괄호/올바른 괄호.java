import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(stack.size() == 0){
                stack.push(s.charAt(i));
                if(s.charAt(i) == ')'){
                    break;
                }
            }
            else{
                if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }
                else if(s.charAt(i) == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }
                    else{
                        stack.push(s.charAt(i));
                    }
                }
            }
        }
            
        if(stack.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}