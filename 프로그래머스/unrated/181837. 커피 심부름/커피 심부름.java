import java.util.stream.IntStream;

class Solution {
    public int solution(String[] order) {
        return IntStream.range(0, order.length).map(i -> order[i].contains("latte") ? 5000 : 4500).sum();
    }
}