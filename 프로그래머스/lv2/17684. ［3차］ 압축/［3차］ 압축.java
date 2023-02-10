import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> result = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("");

        for(int i = 65 ; i < 91 ; i++){
            list.add(String.valueOf((char)i));
        }

        int start = 0;
        int end = 1;

        for(int i = 1 ; i <= msg.length() ; i++){
            end = i;
            String curString = msg.substring(start, end);
            if(list.indexOf(curString) == -1){
                result.add(list.indexOf(msg.substring(start, end - 1)));
                list.add(curString);
                start = end;
                i--;
                start = i;
            }
            else if(i == msg.length()){
                if(list.indexOf(curString) == -1){
                    list.add(curString);
                }
                result.add(list.indexOf(curString));
            }
        }
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}