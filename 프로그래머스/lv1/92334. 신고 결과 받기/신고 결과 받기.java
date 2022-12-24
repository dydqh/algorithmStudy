import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportStartMap = new HashMap<>();
        Map<String, Set<String>> reportEndMap = new HashMap<>();
        
        for(int i = 0 ; i < report.length ; i++){
            String start = report[i].split(" ")[0];
            String end = report[i].split(" ")[1];
            
            Set<String> set;
            if(!reportEndMap.containsKey(end)){
                set = new HashSet<>();
            }
            else{
                set = reportEndMap.get(end);
            }
            set.add(start);
            reportEndMap.put(end, set);
            
            if(!reportStartMap.containsKey(start)){
                set = new HashSet<>();
            }
            else{
                set = reportStartMap.get(start);
            }
            set.add(end);
            reportStartMap.put(start, set);
        }
        
        for(int i = 0 ; i < id_list.length ; i++){
            if(!reportStartMap.containsKey(id_list[i])){
                answer[i] = 0;
            }
            else{
                for(String target : reportStartMap.get(id_list[i])){
                    if(reportEndMap.containsKey(target) && reportEndMap.get(target).size() >= k){
                        answer[i] += 1;
                    }
                }
            }
        }

        
        return answer;
    }
}