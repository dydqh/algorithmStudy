class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s1Item : s1){
            for(String s2Item : s2){
                if(s1Item.equals(s2Item)) answer++;
            }
        }
        return answer;
    }
}