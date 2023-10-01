class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < queries.length ; i++){
            sb.append(my_string.substring(queries[i][0] , queries[i][1] + 1)).reverse();
            my_string = my_string.substring(0, queries[i][0]) + sb.toString() + my_string.substring(queries[i][1] + 1, my_string.length());
            sb.setLength(0);
        }
        return my_string;
    }
}