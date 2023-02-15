import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(stack.size() == 0){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        
        int answer = -1;
        if(stack.size() == 0){
            answer = 1;
        }
        else{
            answer = 0;
        }

        return answer;
    }
}