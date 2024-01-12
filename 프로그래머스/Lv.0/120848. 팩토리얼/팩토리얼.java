class Solution {
    public int solution(int n) {
        int cur = 1;
        int i = 1;
        while(cur <= n){
            i++;
            cur *= i;
        }
        return i - 1;
    }
}