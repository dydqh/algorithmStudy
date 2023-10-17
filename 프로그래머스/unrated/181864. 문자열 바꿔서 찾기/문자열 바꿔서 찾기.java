import java.util.stream.IntStream;

class Solution {
    public int solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer();
        IntStream.range(0, myString.length()).forEach(i -> sb.append(myString.charAt(i) == 'A' ? "B" : "A"));
        return sb.toString().indexOf(pat) > -1 ? 1 : 0;
    }
}