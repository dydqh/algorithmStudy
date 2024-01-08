import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split("")).collect(Collectors.groupingBy(sp -> sp)).entrySet().stream().filter(entry -> entry.getValue().size() <= 1).map(Map.Entry::getKey).sorted().collect(Collectors.joining());
    }
}