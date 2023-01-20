import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] result = Arrays.asList(strings).stream().sorted().sorted(Comparator.comparing(x -> x.substring(n, n + 1))).toArray(String[]::new);
        return result;
    }
}