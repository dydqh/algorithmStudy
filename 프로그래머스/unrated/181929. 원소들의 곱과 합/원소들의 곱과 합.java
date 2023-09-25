import java.util.stream.IntStream;

class Solution {
    int sum = 0;
    int complex = 1;

    public int solution(int[] num_list) {
        IntStream.range(0, num_list.length).forEach(index -> {sum += num_list[index]; complex *= num_list[index];});
        return complex < sum * sum ? 1 : 0;
    }
}