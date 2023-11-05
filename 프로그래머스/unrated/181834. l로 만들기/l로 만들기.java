class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < myString.length() ; i++){
            if(myString.charAt(i) < 'l'){
                sb.append("l");
            }
            else{
                sb.append(myString.charAt(i));
            }
        }
        return sb.toString();
    }
}