import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> i % 2 == ((arr.length + 1) % 2) ? arr[i] + n : arr[i]).toArray();
    }
}