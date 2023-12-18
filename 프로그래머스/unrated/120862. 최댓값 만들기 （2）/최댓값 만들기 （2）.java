import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] temp = Arrays.stream(numbers).sorted().toArray();
        int a = temp[0] * temp[1];
        int b = temp[temp.length - 1] * temp[temp.length - 2];
        return a > b ? a : b;
    }
}