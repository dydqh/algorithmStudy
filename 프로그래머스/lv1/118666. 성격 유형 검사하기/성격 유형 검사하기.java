import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> count = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < survey.length; i++){
            String target = survey[i].substring(0, 1);
            int score = 4 - choices[i];
            if(!count.containsKey(target)){
                count.put(target, score);
            }
            else{
                count.put(target, count.get(target) + score);
            }
        }
        
        if(count.containsKey("R")){
            if(count.containsKey("T")){
                sb.append(count.get("R") >= count.get("T") ? "R" : "T");
            }
            else{
                sb.append(count.get("R") >= 0 ? "R" : "T");
            }
        }
        else if(count.containsKey("T")){
            sb.append(count.get("T") > 0 ? "T" : "R");
        }
        else{
            sb.append("R");
        }
        
        if(count.containsKey("C")){
            if(count.containsKey("F")){
                sb.append(count.get("C") >= count.get("F") ? "C" : "F");
            }
            else{
                sb.append(count.get("C") >= 0 ? "C" : "F");
            }
        }
        else if(count.containsKey("F")){
            sb.append(count.get("F") > 0 ? "F" : "C");
        }
        else{
            sb.append("C");
        }
        
        if(count.containsKey("J")){
            if(count.containsKey("M")){
                sb.append(count.get("J") >= count.get("M") ? "J" : "M");
            }
            else{
                sb.append(count.get("J") >= 0 ? "J" : "M");
            }
        }
        else if(count.containsKey("M")){
            sb.append(count.get("M") > 0 ? "M" : "J");
        }
        else{
            sb.append("J");
        }
        
        if(count.containsKey("A")){
            if(count.containsKey("N")){
                sb.append(count.get("A") >= count.get("N") ? "A" : "N");
            }
            else{
                sb.append(count.get("A") >= 0 ? "A" : "N");
            }
        }
        else if(count.containsKey("N")){
            sb.append(count.get("N") > 0 ? "N" : "A");
        }
        else{
            sb.append("A");
        }
        
        String answer = sb.toString();
        return answer;
    }
}