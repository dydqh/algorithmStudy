import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int curNumber = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0 || arr[i] != curNumber){
                curNumber = arr[i];
                list.add(curNumber);
            }
        }

        return list;
    }
}