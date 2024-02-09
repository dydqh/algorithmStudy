import java.util.*;

class Solution {
    public int solution(String my_string) {
        return my_string.replaceAll("\\D", "").chars().map(i -> i - 48).sum();
    }
}