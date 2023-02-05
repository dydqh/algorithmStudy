import java.util.*;

class Solution {
    public long solution(long n) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        
        while(n > 0){
            long keyLong = n % 10;
            int key = (int)keyLong;
            n /= 10;
            
            if(!map.containsKey(key)){
                map.put(key, 1);
            }
            else{
                map.put(key, map.get(key) + 1);
            }
        }
        
        for(int i = 9 ; i >= 0 ; i--){
            if(map.containsKey(i)){
                for(int j = 0 ; j < map.get(i) ; j++){
                    sb.append(i);
                }
            }
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}