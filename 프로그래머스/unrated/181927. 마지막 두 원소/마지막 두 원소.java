import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = IntStream.range(0, len + 1).map(idx -> { return idx == len ? num_list[idx - 1] - num_list[idx - 2] : num_list[idx]; }).toArray();
        answer[num_list.length] = answer[num_list.length] <= 0 ? answer[num_list.length - 1] * 2 : answer[num_list.length];
        return answer;
    }
}