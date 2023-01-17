import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < tangerine.length ; i++){
            if(!map.containsKey(tangerine[i])){
                map.put(tangerine[i], 1);
            }
            else{
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        
        int result = 0;
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            k -= list.get(i).getValue();
            result += 1;
            if(k <= 0){
                break;
            }
        }
        
        return result;
    }
}