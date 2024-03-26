import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = emergency.clone();
        Arrays.sort(copy);
        int[] answer = new int[emergency.length];
        int eVal = emergency.length;
        for(int i : copy){
            map.put(i, eVal--);
        }
        for(int i = 0 ; i < emergency.length ; i++){
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}