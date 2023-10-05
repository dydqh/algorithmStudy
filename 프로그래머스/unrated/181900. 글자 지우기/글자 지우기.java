import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(indices);
        sb.append(my_string.substring(0, indices[0]));
        IntStream.range(1, indices.length).forEach(i -> sb.append(my_string.substring(indices[i - 1] + 1, indices[i])));
        sb.append(my_string.substring(indices[indices.length - 1] + 1, my_string.length()));
        return sb.toString();
    }
}