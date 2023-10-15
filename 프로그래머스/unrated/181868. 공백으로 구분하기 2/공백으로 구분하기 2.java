import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return Arrays.stream(answer).filter(s -> s.length() > 0).toArray(String[]::new);
    }
}