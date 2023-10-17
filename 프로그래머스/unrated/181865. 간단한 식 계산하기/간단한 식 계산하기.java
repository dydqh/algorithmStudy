class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] items = binomial.split(" ");
        switch(items[1]){
            case "+":
                answer = Integer.parseInt(items[0]) + Integer.parseInt(items[2]);
                break;
            case "-":
                answer = Integer.parseInt(items[0]) - Integer.parseInt(items[2]);
                break;
            case "*":
                answer = Integer.parseInt(items[0]) * Integer.parseInt(items[2]);
                break;
            default:
                break;
        }
        return answer;
    }
}