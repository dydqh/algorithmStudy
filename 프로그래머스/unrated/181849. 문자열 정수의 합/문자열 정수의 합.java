import java.util.stream.IntStream;

class Solution {
    public int solution(String num_str) {
        return IntStream.range(0, num_str.length()).map(i -> num_str.charAt(i) - 48).reduce((a, b) -> a + b).getAsInt();
    }
}