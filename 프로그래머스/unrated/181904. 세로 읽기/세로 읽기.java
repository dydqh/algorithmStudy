class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < my_string.length() / m ; i++){
            sb.append(my_string.charAt(c - 1 + (m * i)));
        }
        return sb.toString();
    }
}