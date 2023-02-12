import java.util.*;

class Solution {
    public String solution(String s) {
        Queue<String> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        boolean isOdd = true;
        
        for(int i = 0 ; i < s.length() ; i++){
            isOdd = true;
            
            if(s.charAt(i) == ' '){
                while(queue.size() > 0){
                    if(isOdd){
                        sb.append(queue.poll().toUpperCase());
                        isOdd = false;
                    }
                    else{
                        sb.append(queue.poll().toLowerCase());
                        isOdd = true;
                    }
                }
                sb.append(" ");
            }
            else{
                queue.add(String.valueOf(s.charAt(i)));
            }
        }
        
        if(queue.size() > 0){
            isOdd = true;
            
            while(queue.size() > 0){
                if(isOdd){
                    sb.append(queue.poll().toUpperCase());
                    isOdd = false;
                }
                else{
                    sb.append(queue.poll().toLowerCase());
                    isOdd = true;
                }
            }
        }
        
        return sb.toString();
    }
}