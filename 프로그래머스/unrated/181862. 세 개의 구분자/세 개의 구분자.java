import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]")).filter(i -> !i.isEmpty()).toArray(String[]::new);
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}