import java.util.*;

class Solution {
    public String[] solution(String[] s) {
        String[] answer = new String[s.length];

        for (int i = 0; i < s.length; i++) {
            String cur = s[i];
            Stack<Character> stack = new Stack<>();
            int count = 0;

            for(int j = 0 ; j < cur.length() ; j++){
                stack.add(cur.charAt(j));

                if(stack.size() >= 3){
                    char[] temp = new char[3];
                    temp[2] = stack.pop();
                    temp[1] = stack.pop();
                    temp[0] = stack.pop();

                    if(new String(temp).equals("110")){
                        count++;
                    }
                    else{
                        stack.add(temp[0]);
                        stack.add(temp[1]);
                        stack.add(temp[2]);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();

            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }

            sb.reverse();
            String temp2 = sb.toString() + "11";
            int index = temp2.indexOf("111");

            if(index == -1){
                answer[i] = sb.append("110".repeat(count)).toString();
            }
            else{
                answer[i] = sb.insert(index, "110".repeat(count)).toString();
            }
        }

        return answer;
    }
}