class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                answer = false;
                break;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                answer = false;
                break;
            }
            else if(s.length() != 4 && s.length() != 6){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}