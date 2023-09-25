class Solution {
    public String solution(String code) {
        StringBuffer sb = new StringBuffer();
        int mode = 0;
        for(int i = 0 ; i < code.length() ; i++){
            if(code.charAt(i) == '1'){
                mode = mode == 0 ? 1 : 0;
            }
            else if(mode == 0 && i % 2 == 0){
                sb.append(code.charAt(i));
            }
            else if(mode == 1 && i % 2 == 1){
                sb.append(code.charAt(i));
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}