import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] answer = myString.split("x");
        Arrays.stream(answer).sorted().filter(i -> i.length() > 0).forEach(i -> list.add(i));
        return list.toArray(String[]::new);
    }
}