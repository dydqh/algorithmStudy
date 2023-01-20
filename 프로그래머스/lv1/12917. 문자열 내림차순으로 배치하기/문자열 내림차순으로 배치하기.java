import java.util.*;

class Solution {
    public String solution(String s) {
        int[] charCount = new int[140];
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < s.length() ; i++){
            charCount[s.charAt(i)] += 1;
        }
        
        for(int i = 123 ; i >= 65 ; i--){
            for(int j = 0 ; j < charCount[i] ; j++){
                sb.append((char)i);
            }
        }
        
        
        return sb.toString();
    }
}