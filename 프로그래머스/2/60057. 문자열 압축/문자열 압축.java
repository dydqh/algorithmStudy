import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        Stack<String> stack = new Stack<>();
        List<String> list = new ArrayList<>();

        for(int i = 1 ; i <= s.length() / 2 ; i++){
            int length = 0;
            int index = 0;
            for(int j = 0 ; j <= s.length() - i ; j += i){
                list.add(s.substring(j, j + i));
                index = j;
            }
            if(index + i < s.length()){
                list.add(s.substring(index + i));
            }
            for(int j = 0 ; j < list.size() ; j++){
                if(!stack.isEmpty() && !stack.peek().equals(list.get(j))){
                    length += (stack.size() == 1 ? i : (i + String.valueOf(stack.size()).length()));
                    stack.clear();
                }
                stack.push(list.get(j));
            }
            length += (stack.size() == 1 ? stack.peek().length() : (i + String.valueOf(stack.size()).length()));

            stack.clear();
            list.clear();
            answer = Math.min(answer, length);
        }
        return answer;
    }
}