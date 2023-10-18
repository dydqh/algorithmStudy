import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int count = IntStream.range(0, arr.length).map(i -> arr[i]).sum();
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i] ; j++){
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}