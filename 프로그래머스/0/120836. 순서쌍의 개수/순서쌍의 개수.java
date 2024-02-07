import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).map(i -> n % i == 0 ? 1 : 0).sum(); 
    } 
}