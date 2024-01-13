class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        String u = my_string.toUpperCase();
        for(int i = 0 ; i < u.length() ; i++){
            sb.append(my_string.charAt(i) != u.charAt(i) ? u.charAt(i) : String.valueOf(u.charAt(i)).toLowerCase());
        }
        return sb.toString();
    }
}