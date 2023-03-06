import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        else{
            int min = arr[0];
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < arr.length ; i++){
                min = min > arr[i] ? arr[i] : min;
                list.add(arr[i]);
            }
        
            int[] answer = new int[arr.length - 1];
            int index = 0;
            for(int i = 0 ; i < arr.length - 1 ; i++){
                if(list.get(index) != min){
                    answer[i] = list.get(index);
                }
                else{
                    i--;
                }
                index++;
            }
            
            return answer;
        }
    }
}