import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        String[] result = new String[]{"", ""};
        IntStream.range(0, num_list.length).forEach(index -> result[num_list[index] % 2] += num_list[index]);
        return Integer.parseInt(result[0]) + Integer.parseInt(result[1]);
    }
}