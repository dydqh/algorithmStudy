import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;
        
        for(int i = 0 ; i < query.length ; i++){
            if(i % 2 == 0){
                end = query[i] + start;
            }
            else{
                start = query[i] + start;
            }
        }
        
        return IntStream.rangeClosed(start, end).map(idx -> arr[idx]).toArray();
    }
}