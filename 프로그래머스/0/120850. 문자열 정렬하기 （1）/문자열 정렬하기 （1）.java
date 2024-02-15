import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        return my_string.chars().filter(i -> i <= '9' && i >= '0').map(i -> i - 48).sorted().toArray();
    }
}