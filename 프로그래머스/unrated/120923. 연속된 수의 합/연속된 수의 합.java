import java.util.stream.IntStream;

class Solution {
    public int[] solution(int num, int total) {
        if(num % 2 == 0){
            return IntStream.rangeClosed(total / num - num / 2 + 1,total / num + num / 2 ).toArray();
        }
        else{
            return IntStream.rangeClosed(total / num - num / 2,total / num + num / 2 ).toArray();
        }
    }
}