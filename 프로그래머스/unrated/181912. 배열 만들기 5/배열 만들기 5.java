import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs).mapToInt(num -> Integer.parseInt(num.substring(s, s + l))).filter(num -> num > k).toArray();
    }
}