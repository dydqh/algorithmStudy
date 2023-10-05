import java.util.stream.IntStream;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        IntStream.range(0, my_string.length()).forEach(i -> { int idx = (int)my_string.charAt(i) < 97 ? (int)my_string.charAt(i) - 65 : (int)my_string.charAt(i) - 97 + 26; answer[idx]++; } );
        return answer;
    }
}