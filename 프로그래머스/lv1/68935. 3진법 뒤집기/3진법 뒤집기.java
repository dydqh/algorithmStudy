import java.util.*;

class Solution {
    public int solution(int n) {
        Stack<Integer> stack = new Stack<>();
        
        while(n >= 3){
            stack.add(n % 3);
            n /= 3;
        }
        
        int answer = n;
        int count = 0;
        
        while(stack.size() > 0){
            int target = 3;
            for(int i = 0 ; i < count ; i++){
                target *= 3;
            }
            answer += stack.pop() * target;
            count += 1;
        }
        return answer;
    }
}