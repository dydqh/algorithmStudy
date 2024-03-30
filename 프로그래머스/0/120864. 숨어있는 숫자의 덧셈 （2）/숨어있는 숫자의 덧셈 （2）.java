class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] results = my_string.split("[a-zA-z]");
        for(String result : results){
            if(!result.isBlank() && !result.isEmpty()){
                answer += Integer.parseInt(result);
            }
        }
        return answer;
    }
}