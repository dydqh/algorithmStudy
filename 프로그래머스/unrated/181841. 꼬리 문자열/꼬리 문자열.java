import java.util.stream.IntStream;

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuffer sb = new StringBuffer();
        IntStream.range(0, str_list.length).filter(i -> !str_list[i].contains(ex)).forEach(i -> sb.append(str_list[i]));
        return sb.toString();
    }
}