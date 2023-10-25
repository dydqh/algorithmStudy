import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return IntStream.range(0, num_list.length - 5).map(i -> num_list[i + 5]).toArray();
    }
}