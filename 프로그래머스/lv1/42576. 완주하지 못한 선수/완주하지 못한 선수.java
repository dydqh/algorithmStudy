import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> p = Arrays.asList(participant);
        Collections.sort(p);
        List<String> c = Arrays.asList(completion);
        Collections.sort(c);
        String answer = "";
        
        for(int i = 0 ; i < p.size() ; i++){
            if(i == c.size()){
                answer = p.get(i);
            }
            else if(!c.get(i).equals(p.get(i))){
                answer = p.get(i);
                break;
            }
        }
        
        return answer;
    }
}