class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] count = new int[26];
        for(char bC : before.toCharArray()) count[bC - 97]++;
        for(char aC : after.toCharArray()) count[aC - 97]--;
        for(int check : count){
            if(check != 0){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}