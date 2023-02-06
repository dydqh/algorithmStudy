import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < topping.length ; i++){
            if(!map.containsKey(topping[i])){
                map.put(topping[i], 1);
            }
            else{
                map.put(topping[i], map.get(topping[i]) + 1);
            }
        }
        
        int answer = 0;
        Set<Integer> left = new HashSet<>();
        
        for(int i = 0 ; i < topping.length ; i++){
            left.add(topping[i]);
            if(map.get(topping[i]) > 1){
                map.put(topping[i], map.get(topping[i]) - 1);
            }
            else if(map.containsKey(topping[i])){
                map.remove(topping[i]);
            }
            
            if(left.size() == map.keySet().size()){
                answer += 1;
            }
        }
        
        return answer;
    }
}