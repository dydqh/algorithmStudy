class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < myString.length() ; i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                sb.append(myString.substring(i, i + 1).toUpperCase());
            }
            else{
                sb.append(myString.substring(i, i + 1).toLowerCase());
            }
        }
        return sb.toString();
    }
}