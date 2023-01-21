class Solution {
    public boolean solution(int x) {
        int target = x;
        int sum = 0;
        boolean answer = false;
        
        while(target > 0){
            sum += (target % 10);
            target /= 10;
        }
        
        if(x % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}