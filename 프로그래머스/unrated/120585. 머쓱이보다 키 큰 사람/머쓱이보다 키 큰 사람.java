import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        return Arrays.stream(array).map(i -> i > height ? 1 : 0).sum();
    }
}