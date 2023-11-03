import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream.range(0, arr.length).map(i -> k % 2 == 0 ? arr[i] + k : arr[i] * k).toArray();
    }
}