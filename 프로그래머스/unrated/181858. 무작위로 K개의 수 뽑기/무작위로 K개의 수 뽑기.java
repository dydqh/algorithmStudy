import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(i -> {if(list.size() < k && list.indexOf(i) == -1){ list.add(i); }});
        while(list.size() < k){
            list.add(-1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}