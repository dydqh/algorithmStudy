import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < s.length() ; j++){
                int index = i + j >= s.length() ? i + j - s.length() : i + j;
                if(stack.size() == 0){
                    stack.push(s.charAt(index));
                }
                else{
                    if(stack.peek() == '['){
                        if(s.charAt(index) == ']'){
                            stack.pop();
                        }
                        else{
                            stack.push(s.charAt(index));
                        }
                    }
                    else if(stack.peek() == '('){
                        if(s.charAt(index) == ')'){
                            stack.pop();
                        }
                        else{
                            stack.push(s.charAt(index));
                        }
                    }
                    else if(stack.peek() == '{'){
                        if(s.charAt(index) == '}'){
                            stack.pop();
                        }
                        else{
                            stack.push(s.charAt(index));
                        }
                    }
                    else{
                        stack.push(s.charAt(index));
                    }
                }
            }
            if(stack.size() == 0){
                result += 1;
            }
            else{
                stack.clear();
            }
        }
        return result;
    }
}