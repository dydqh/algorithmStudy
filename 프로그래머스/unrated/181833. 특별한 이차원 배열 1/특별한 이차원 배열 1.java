import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        IntStream.range(0, n).forEach(i -> answer[i][i] = 1);
        return answer;
    }
}