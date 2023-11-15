class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() - 1) / n + 1];
        for(int i = 0 ; i < answer.length - 1 ; i++){
            answer[i] = my_str.substring(n * i, n * (i + 1));
        }
        if(answer[answer.length - 1] == null){
            answer[answer.length - 1] = my_str.substring(n * (answer.length - 1), my_str.length());
        }
        return answer;
    }
}