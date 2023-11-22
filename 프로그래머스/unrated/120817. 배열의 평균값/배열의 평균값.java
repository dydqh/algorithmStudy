import java.util.stream.IntStream;

class Solution {
    public double solution(int[] numbers) {
        return (double)IntStream.range(0, numbers.length).map(i -> numbers[i]).sum() / numbers.length;
    }
}