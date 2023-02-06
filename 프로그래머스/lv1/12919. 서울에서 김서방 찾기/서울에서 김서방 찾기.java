import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] seoul) {
        StringBuffer sb = new StringBuffer();
        List<String> seoulList = Arrays.asList(seoul).stream().map(String::new).collect(Collectors.toList());
        sb.append("김서방은 ").append(seoulList.indexOf("Kim")).append("에 있다");

        return sb.toString();
    }
}