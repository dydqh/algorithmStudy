import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int count = 0;
        
        for(int i = 0 ; i < record.length ; i++){
            String[] splited = record[i].split(" ");
            switch (splited[0]){
                case "Enter":
                    map.put(splited[1], splited[2]);
                    count++;
                    break;
                case "Leave":
                    count++;
                    break;
                case "Change":
                    map.put(splited[1], splited[2]);
                    break;
                default:
                    break;
            }
        }
        
        String[] answer = new String[count];
        int index = 0;
        
        for(int i = 0 ; i < record.length ; i++){
            String[] splited = record[i].split(" ");
            switch (splited[0]){
                case "Enter":
                    sb.append(map.get(splited[1])).append("님이 들어왔습니다.");
                    answer[index] = sb.toString();
                    index++;
                    sb.setLength(0);
                    break;
                case "Leave":
                    sb.append(map.get(splited[1])).append("님이 나갔습니다.");
                    answer[index] = sb.toString();
                    index++;
                    sb.setLength(0);
                    break;
                default:
                    break;
            }
        }
        
        return answer;
    }
}