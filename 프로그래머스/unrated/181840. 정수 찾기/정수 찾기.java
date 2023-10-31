import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[i] == n ? 1 : 0).sum() > 0 ? 1 : 0;
    }
}