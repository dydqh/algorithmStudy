import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        Map<String, Integer> count = new HashMap<>();
        Set<String> set = new HashSet<>();
        int length = 100001;
        int[] answer = new int[2];
        int start = 0;
        int end = 0;
        int size = 0;

        for (String gem : gems) {
            set.add(gem);
        }

        while(end <= gems.length){
            if(size == set.size()){
                if(end - start < length){
                    answer[0] = start;
                    answer[1] = end;
                    length = end - start;
                }
                count.put(gems[start], count.get(gems[start]) - 1);
                if(count.get(gems[start]) == 0){
                    count.remove(gems[start]);
                    size--;
                }
                start++;
            }
            else{
                if(end >= gems.length){
                    break;
                }

                if(!count.containsKey(gems[end])){
                    count.put(gems[end], 1);
                    size++;
                }
                else{
                    count.put(gems[end], count.get(gems[end]) + 1);
                }

                end++;
            }
        }

        answer[0]++;
        return answer;
    }
}