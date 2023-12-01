class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        my_string.chars().mapToObj(i -> String.valueOf((char)i).toLowerCase()).sorted().forEach(i -> sb.append(i));
        return sb.toString();
    }
}