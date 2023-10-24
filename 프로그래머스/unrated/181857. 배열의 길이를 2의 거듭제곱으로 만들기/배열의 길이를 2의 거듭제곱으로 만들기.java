import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int count = 1;
        while(arr.length > count){ count *= 2; }
        int[] result = IntStream.range(0, count).map(i -> { return i < arr.length ? arr[i] : 0; }).toArray();
        return result;
    }
}