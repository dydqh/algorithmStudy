import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] temp = IntStream.range(0, rank.length).filter(i -> attendance[i]).mapToObj(i -> i).sorted((a, b) -> rank[a] - rank[b]).mapToInt(i -> i).toArray();
        return 10000 * temp[0] + 100 * temp[1] + temp[2];
    }
}