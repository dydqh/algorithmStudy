class Solution {
    public int solution(int i, int j, int k) {
        StringBuffer sb = new StringBuffer();
        for(int n = i ; n <= j ; n++) sb.append(n);
        return sb.toString().length() - sb.toString().replace(String.valueOf(k), "").length();
    }
}