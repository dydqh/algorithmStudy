import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i < arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            }
            else{
                int idx = list.size() - 1;
                if(list.get(idx) < arr[i]){
                    list.add(arr[i]);
                    i++;
                }
                else{
                    list.remove(idx);
                }
            }
        }
        int[] stk = list.stream().mapToInt(num -> num).toArray();
        return stk;
    }
}