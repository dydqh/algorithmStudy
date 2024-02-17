class Solution {
    public String solution(String my_string) {
        boolean[] target = new boolean[130];
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < my_string.length() ; i++){
            if(!target[my_string.charAt(i)]){
                target[my_string.charAt(i)] = true;
                sb.append(my_string.substring(i, i+1));
            }
        }
        return sb.toString();
    }
}