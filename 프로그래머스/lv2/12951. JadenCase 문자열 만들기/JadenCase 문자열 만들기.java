class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < s.length() ; i++){
            char target = s.charAt(i);
            if(i == 0){
                if(target >= '0' && target <= '9'){
                    sb.append(target);
                }
                else if(target == ' '){
                    sb.append(target);
                }
                else{
                    sb.append(String.valueOf(target).toUpperCase());
                }
            }
            else{
                char before = s.charAt(i - 1);
                if(target >= '0' && target <= '9'){
                    sb.append(target);
                }
                else if(before == ' '){
                    sb.append(String.valueOf(target).toUpperCase());
                }
                else{
                    sb.append(String.valueOf(target).toLowerCase());
                }
            }
        }
        
        return sb.toString();
    }
}