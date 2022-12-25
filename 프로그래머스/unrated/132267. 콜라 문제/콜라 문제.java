class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int newcoke = 0;
        
        while(n >= a){
            newcoke = n / a * b;
            n = newcoke + n % a;
            answer += newcoke;
        }
        
        return answer;
    }
}