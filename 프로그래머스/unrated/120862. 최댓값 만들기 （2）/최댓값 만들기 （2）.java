import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] temp = Arrays.stream(numbers).sorted().toArray();
        return Math.max(temp[0] * temp[1], temp[temp.length - 1] * temp[temp.length - 2]);
    }
}