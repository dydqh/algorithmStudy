import java.util.*;

class Solution {
    public long solution(int[] weights) {
        Map<Double, Integer> map = new HashMap<>();

        for(int i = 0 ; i < weights.length ; i++){
            if(!map.containsKey((double)weights[i])){
                map.put((double)weights[i], 1);
            }
            else{
                map.put((double)weights[i], map.get((double)weights[i]) + 1);
            }
        }

        long result = 0;

        List<Double> mapKeyList = new ArrayList<>(map.keySet());
        Collections.sort(mapKeyList);
        
        for(int i = 0 ; i < mapKeyList.size() ; i++){
            double curNumber = mapKeyList.get(i);
            long curNumberCount = map.get(mapKeyList.get(i));

            if(curNumberCount >= 2){
                result += (curNumberCount * (curNumberCount - 1) / 2);
            }

            if(map.containsKey(curNumber * 2)){
                result += (curNumberCount * (map.get(curNumber * 2)));
            }

            if(map.containsKey(curNumber * 3 / 2)){
                result += (curNumberCount * (map.get(curNumber * 3 / 2)));
            }

            if(map.containsKey(curNumber * 4 / 3)){
                result += (curNumberCount * (map.get(curNumber * 4 / 3)));
            }
        }

        return result;
    }
}