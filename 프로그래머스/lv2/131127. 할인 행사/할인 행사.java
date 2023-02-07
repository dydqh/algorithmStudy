import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> discountMap = new HashMap<>();
        int answer = 0;
        
        for(int i = 0 ; i < want.length ; i++){
            wantMap.put(want[i], number[i]);
        }
        
        for(int i = 0 ; i < discount.length - 9 ; i++){
            discountMap.clear();
            
            for(int j = i ; j < i + 10 ; j++){
                if(!discountMap.containsKey(discount[j])){
                    discountMap.put(discount[j], 1);
                }
                else{
                    discountMap.put(discount[j], discountMap.get(discount[j]) + 1);
                }
            }
            
            boolean isTie = true;
            for(int j = 0 ; j < want.length ; j++){
                if(!discountMap.containsKey(want[j])){
                    isTie = false;
                    break;
                }
                
                if(wantMap.get(want[j]) != discountMap.get(want[j])){
                    isTie = false;
                    break;
                }
            }
            
            if(isTie){
                answer += 1;
            }
        }
        
        return answer;
    }
}