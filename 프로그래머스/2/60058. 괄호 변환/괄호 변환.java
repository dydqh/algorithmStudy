import java.util.*;

class Solution {
    public String solution(String p) {
        return solve(p);
    }
    
    public static String solve(String p){
        if(p.isEmpty()){
            return p;
        }
        else{
            StringBuilder sb = new StringBuilder();
            String[] temp = separate(p);
            String u = temp[0];
            String v = temp[1];

            if(isBalanced(u)){
                sb.append(u);
                sb.append(solve(v));
            }
            else{
                sb.append("(").append(solve(v)).append(")");
                StringBuilder tempSb = new StringBuilder();
                for(int i = 1 ; i < u.length() - 1 ; i++){
                    tempSb.append(u.charAt(i) == ')' ? '(' : ')');
                }
                sb.append(tempSb.toString());
            }

            return sb.toString();
        }
    }

    public static String[] separate(String p){
        Stack<Character> stack = new Stack<>();
        stack.push(p.charAt(0));
        int index = 1;
        while(!stack.isEmpty()){
            if(stack.peek() == p.charAt(index)){
                stack.push(p.charAt(index));
            }
            else{
                stack.pop();
            }
            index++;
        }
        return new String[]{p.substring(0, index), p.substring(index)};
    }

    public static boolean isBalanced(String u){
        Stack<Character> stack = new Stack<>();
        boolean result = true;

        for(int i = 0 ; i < u.length() ; i++){
            if(stack.isEmpty()){
                if(u.charAt(i) == ')'){
                    result = false;
                    break;
                }
                else{
                    stack.push(u.charAt(i));
                }
            }
            else{
                if(stack.size() == 1 && stack.peek() == ')'){
                    result = false;
                    break;
                }
                else if(stack.peek() == '(' && u.charAt(i) == ')'){
                    stack.pop();
                }
                else{
                    stack.push(u.charAt(i));
                }
            }
        }

        if(!stack.isEmpty()) result = false;
        return result;
    }
}

