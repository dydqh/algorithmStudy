class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i = myString.length() - pat.length() ; i >= 0 ; i--){
            if(myString.indexOf(pat, i) > -1){
                answer = myString.substring(0, i + pat.length());
                break;
            };
        } 
        return answer;
    }
}