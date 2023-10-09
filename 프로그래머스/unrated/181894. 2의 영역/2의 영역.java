import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(start == -1 && arr[i] == 2){
                start = i;
            }
            if(arr[i] == 2){
                end = i;
            }
        }
        if(start == -1){
            return new int[]{-1};
        }
        else{
            return IntStream.rangeClosed(start, end).map(i -> arr[i]).toArray();
        }
    }
}