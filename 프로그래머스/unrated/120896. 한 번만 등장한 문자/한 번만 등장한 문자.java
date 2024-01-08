import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String s) {
        int[] count = new int[123];
        s.chars().forEach(i -> count[i]++);
        return IntStream.range(97, 123).filter(i -> count[i] == 1).sorted().mapToObj(i -> (char)i + "").collect(Collectors.joining());
    }
}