import java.util.*;

class Solution {
    public int solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> resultList = new ArrayList<>();
        boolean whileBreak = false;
        
        while(true){
            char x = s.charAt(0);
            int xCount = 0;
            int nonXCount = 0;
            int sLength = s.length();
            
            for(int i = 0; i < sLength; i++){
                if(s.charAt(i) == x){
                    xCount += 1;
                }
                else{
                    nonXCount += 1;
                }
                
                if(xCount == nonXCount){
                    resultList.add(s.substring(0, i+1));
                    if(i+1 != s.length()){
                        s = s.substring(i+1, s.length());
                    }
                    else{
                        whileBreak = true;
                    }
                    break;
                }
                
                if(i+1 == s.length()){
                    resultList.add(s.substring(0, i+1));
                    whileBreak = true;
                    break;
                }
                
                if(s.equals(s.substring(i+1, s.length()))){
                    resultList.add(s.substring(0, i+1));
                    whileBreak = true;
                    break;
                }
            }
            
            if(whileBreak){
                break;
            }
        }
        
        return resultList.size();
    }
}